package com.example.Online_library_management_system.dto.response;

import com.example.Online_library_management_system.enums.BookCategory;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookResponseDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String description;
    private String publisher;
    private Integer stockQuantity;
    private String edition;
    private BigDecimal averageRating;
    private String coverImageUrl;
    private BookCategory category;
    private Boolean isAvailable;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
