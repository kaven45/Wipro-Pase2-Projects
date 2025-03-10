package com.kaven.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kaven.library.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
