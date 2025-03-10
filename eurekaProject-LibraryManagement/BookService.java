package com.kaven.book.service;

import com.kaven.book.entity.Book;
import com.kaven.book.repository.BookRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @CircuitBreaker(name = "bookService", fallbackMethod = "fallbackGetAllBooks")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> fallbackGetAllBooks(Exception e) {
        System.out.println("Fallback method triggered: " + e.getMessage());
        return Collections.emptyList();
    }
    
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
