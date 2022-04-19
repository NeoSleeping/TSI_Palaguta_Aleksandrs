package lv.tsi.student.service;

import lombok.RequiredArgsConstructor;
import lv.tsi.student.module.ErrorResponse;
import lv.tsi.student.module.Student;
import lv.tsi.student.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    /**
     * Get list of all students from database using {@link StudentRepository}
     *
     * @return list of students
     */
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    /**
     * Get student by id using {@link StudentRepository}
     *
     * @param id Student ID
     * @return Student
     */
    public ResponseEntity<Object> getStudentById(long id) {
        var student = studentRepository.findById(id);

        return student.<ResponseEntity<Object>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(
                                ErrorResponse.builder()
                                        .errorCode("STUDENT_NOT_FOUND")
                                        .errorMessage("Student does not exist with id:" + id)
                                        .referenceId(UUID.randomUUID().toString())
                                        .build()
                        ));
    }

    /**
     * Save student using {@link StudentRepository}
     *
     * @param student Student data
     * @return saved Student
     */
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }


    /**
     * Delete student by id
     *
     * @param id student id
     * @return deleted student id
     */
    public long deleteStudent(long id) {
        studentRepository.deleteById(id);
        return id;
    }
}
