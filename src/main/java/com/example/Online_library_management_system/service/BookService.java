package com.example.Online_library_management_system.service;

import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;

import java.util.List;

public interface BookService {

    BookResponseDTO CreateBook(BookRequestDTO bookRequestDTO);

    List<BookResponseDTO> getAllBooks();
}
