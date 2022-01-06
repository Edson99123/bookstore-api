package com.edsondev.bookstore;

import com.edsondev.bookstore.domain.Categoria;
import com.edsondev.bookstore.domain.Livro;
import com.edsondev.bookstore.repositories.CategoriaReposytory;
import com.edsondev.bookstore.repositories.LivroReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	CategoriaReposytory categoriaReposytory;

	@Autowired
	LivroReposytory livroReposytory;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem inpsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaReposytory.saveAll(Arrays.asList(cat1));
		this.livroReposytory.saveAll(Arrays.asList(l1));

	}
}
