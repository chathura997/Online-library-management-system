package com.example.Online_library_management_system.service;

import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;

public interface BookService {

    BookResponseDTO CreateBook(BookRequestDTO bookRequestDTO);
}
