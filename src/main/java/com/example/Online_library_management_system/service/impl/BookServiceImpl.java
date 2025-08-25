package com.example.Online_library_management_system.service.impl;

import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.entity.Book;
import com.example.Online_library_management_system.mapper.BookMapper;
import com.example.Online_library_management_system.repository.BookRepository;
import com.example.Online_library_management_system.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    private final BookRepository bookRepository;

    public BookServiceImpl(BookMapper bookMapper, BookRepository bookRepository) {
        this.bookMapper = bookMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public BookResponseDTO CreateBook(BookRequestDTO bookRequestDTO) {

        Book book = bookMapper.toEntity(bookRequestDTO);
        Book savedBook = bookRepository.save(book);

        return bookMapper.toDTO(savedBook);
    }
}
