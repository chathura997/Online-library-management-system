package com.example.Online_library_management_system.mapper;


import com.example.Online_library_management_system.dto.request.BookRequestDTO;
import com.example.Online_library_management_system.dto.response.BookResponseDTO;
import com.example.Online_library_management_system.entity.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BookMapper {


    public Book toEntity(BookRequestDTO requestDto) {
        if (requestDto == null) {
            return null;
        }

        return Book.builder()
                .title(requestDto.getTitle())
                .author(requestDto.getAuthor())
                .isbn(requestDto.getIsbn())
                .description(requestDto.getDescription())
                .publisher(requestDto.getPublisher())
                .stockQuantity(requestDto.getStockQuantity() != null ? requestDto.getStockQuantity() : 0)
                .edition(requestDto.getEdition())
                .averageRating(requestDto.getAverageRating() != null ? requestDto.getAverageRating() : BigDecimal.ZERO)
                .coverImageUrl(requestDto.getCoverImageUrl())
                .category(requestDto.getCategory())
                .isAvailable(requestDto.getIsAvailable() != null ? requestDto.getIsAvailable() : true)
                .build();
    }


    public BookResponseDTO toDTO(Book book){
        if(book == null){
            return null;
        }

        return BookResponseDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .isbn(book.getIsbn())
                .description(book.getDescription())
                .publisher(book.getPublisher())
                .stockQuantity(book.getStockQuantity())
                .edition(book.getEdition())
                .averageRating(book.getAverageRating())
                .coverImageUrl(book.getCoverImageUrl())
                .category(book.getCategory())
                .isAvailable(book.getIsAvailable())
                .createdAt(book.getCreatedAt())
                .updatedAt(book.getUpdatedAt())
                .createdBy(book.getCreatedBy())
                .updatedBy(book.getUpdatedBy())
                .build();
    }


}
