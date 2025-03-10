package com.kaven.library.service;

import com.kaven.library.entity.Library;
import com.kaven.library.repository.LibraryRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;
    private final RestTemplate restTemplate;
    private static final String BOOK_SERVICE_CB = "bookServiceCB";
    
    public LibraryService(LibraryRepository libraryRepository, RestTemplate restTemplate) {
        this.libraryRepository = libraryRepository;
        this.restTemplate = restTemplate;
    }

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Library getLibraryById(Long id) {
        return libraryRepository.findById(id).orElse(null);
    }

    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
    
    @CircuitBreaker(name = BOOK_SERVICE_CB, fallbackMethod = "bookServiceFallback")
    public String getBookDetails(Long bookId) {
        return restTemplate.getForObject("http://book-service/books/" + bookId, String.class);
    }

    // Fallback method when book-service is unavailable
    public String bookServiceFallback(Long bookId, Throwable e) {
        return "Book details are currently unavailable.";
    }
}
