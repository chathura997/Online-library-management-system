package com.example.Online_library_management_system.service.impl;

import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.entity.Book;
import com.example.Online_library_management_system.mapper.BookMapper;
import com.example.Online_library_management_system.repository.BookRepository;
import com.example.Online_library_management_system.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<BookResponseDTO> getAllBooks() {
        List<Book> bookList = bookRepository.findAll();

        List<BookResponseDTO> bookResponseDTOS = bookList.stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());

        return bookResponseDTOS;
    }
}
