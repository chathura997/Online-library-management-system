package com.example.Online_library_management_system.controller;


import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.service.BookService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/books")
public class BookController {
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@Valid @RequestBody BookRequestDTO requestDto) {
        BookResponseDTO responseDto = bookService.CreateBook(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

}
