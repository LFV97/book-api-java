package com.lfv.books.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lfv.books.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional custom methods if needed
}
