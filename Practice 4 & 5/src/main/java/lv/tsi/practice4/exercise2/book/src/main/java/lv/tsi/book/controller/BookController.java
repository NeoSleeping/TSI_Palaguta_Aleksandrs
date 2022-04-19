package lv.tsi.book.controller;

import lombok.RequiredArgsConstructor;
import lv.tsi.book.module.Book;
import lv.tsi.book.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping("/getBooks")
    public ResponseEntity<List<Book>> findBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/getBook")
    public ResponseEntity<Book> findBook(@RequestParam(value = "id") Long id) {
        return bookRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
