package lv.tsi.student.controller;

import lombok.RequiredArgsConstructor;
import lv.tsi.student.module.Student;
import lv.tsi.student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getAllStudent() {
        return studentService.getStudents();
    }

    @GetMapping("/getStudent")
    public ResponseEntity<Object> getStudentById(@RequestParam(value = "id") Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<Student> deleteStudentById(@RequestParam(value = "id") Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        var saveStudent = studentService.addStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveStudent);
    }
}
