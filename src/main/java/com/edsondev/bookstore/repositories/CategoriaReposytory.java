package com.edsondev.bookstore.repositories;

import com.edsondev.bookstore.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaReposytory extends JpaRepository<Categoria, Long> {

}
