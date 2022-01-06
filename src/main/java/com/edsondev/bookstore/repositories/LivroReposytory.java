package com.edsondev.bookstore.repositories;

import com.edsondev.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroReposytory extends JpaRepository<Livro, Long> {
}
