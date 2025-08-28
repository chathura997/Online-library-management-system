package com.example.Online_library_management_system.controller;


import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.service.BookService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@Valid @RequestBody BookRequestDTO requestDto) {
        BookResponseDTO responseDto = bookService.create(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getAll() {
        List<BookResponseDTO> books = bookService.getAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> getBookById(@PathVariable Long id) {
        BookResponseDTO bookResponseDTO = bookService.getById(id);
        return ResponseEntity.ok(bookResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
