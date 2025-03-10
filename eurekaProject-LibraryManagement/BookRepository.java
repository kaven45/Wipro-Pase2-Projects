package com.kaven.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kaven.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
