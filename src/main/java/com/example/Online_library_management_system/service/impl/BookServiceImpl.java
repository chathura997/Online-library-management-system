package com.example.Online_library_management_system.service.impl;

import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.entity.Book;
import com.example.Online_library_management_system.exceptions.EntityNotFoundException;
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
    public BookResponseDTO create(BookRequestDTO bookRequestDTO) {

        Book book = bookMapper.toEntity(bookRequestDTO);
        Book savedBook = bookRepository.save(book);

        return bookMapper.toDTO(savedBook);
    }

    @Override
    public List<BookResponseDTO> getAll() {
        List<Book> bookList = bookRepository.findAll();
        return bookList.stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookResponseDTO getById(Long id) {

        Book book = bookRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("Book",id));
        return bookMapper.toDTO(book);
    }

    @Override
    public void delete(Long id) {
        if(!bookRepository.existsById(id)){
            throw new EntityNotFoundException("Book",id);
        }
        bookRepository.deleteById(id);
    }
}
