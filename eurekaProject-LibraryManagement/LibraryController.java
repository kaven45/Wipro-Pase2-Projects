package com.kaven.library.controller;

import com.kaven.library.entity.Library;
import com.kaven.library.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    private final LibraryService libraryService;
    
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    @GetMapping("/{id}")
    public Library getLibraryById(@PathVariable Long id) {
        return libraryService.getLibraryById(id);
    }

    @PostMapping
    public Library saveLibrary(@RequestBody Library library) {
        return libraryService.saveLibrary(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryService.deleteLibrary(id);
    }
    
    @GetMapping("/books/{bookId}")
    public String getBookDetails(@PathVariable Long bookId) {
        return libraryService.getBookDetails(bookId);
    }
}
