CREATE TABLE books (
                       id BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       author VARCHAR(255) NOT NULL,
                       isbn VARCHAR(255) UNIQUE NOT NULL,
                       description TEXT,
                       publisher VARCHAR(255) NOT NULL,
                       stock_quantity INTEGER NOT NULL DEFAULT 0,

                       edition VARCHAR(50),
                       average_rating DECIMAL(2,1) DEFAULT 0.0,
                       cover_image_url VARCHAR(500),
                       is_available BOOLEAN NOT NULL DEFAULT true,
                       created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       created_by VARCHAR(255),
                       updated_by VARCHAR(255),

    -- Constraints
                       CONSTRAINT chk_stock_quantity_non_negative CHECK (stock_quantity >= 0),
                       CONSTRAINT chk_average_rating_range CHECK (average_rating >= 0.0 AND average_rating <= 5.0)
);

-- Create indexes for better query performance
CREATE INDEX idx_book_isbn ON books(isbn);
CREATE INDEX idx_book_title ON books(title);
CREATE INDEX idx_book_author ON books(author);

