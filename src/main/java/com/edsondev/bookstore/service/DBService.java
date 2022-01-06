package com.edsondev.bookstore.service;

import com.edsondev.bookstore.domain.Categoria;
import com.edsondev.bookstore.domain.Livro;
import com.edsondev.bookstore.repositories.CategoriaReposytory;
import com.edsondev.bookstore.repositories.LivroReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    CategoriaReposytory categoriaReposytory;
    @Autowired
    LivroReposytory livroReposytory;

    public void instaciaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
        Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
        Categoria cat3 = new Categoria(null, "Biografias", "Livro de Biografias");


        Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem inpsum", cat1);
        Livro l2 = new Livro(null, "Engenharia de software", "Louis V Gerstner", "Lorem inpsum", cat1);
        Livro l3 = new Livro(null, "The Time Machine", "H.G Wells", "Lorem inpsum", cat2);
        Livro l4 = new Livro(null, "The War of the Worlds", "H.G Wells", "Lorem inpsum", cat2);
        Livro l5 = new Livro(null, "I, Bobot", "Issac Asimov", "Lorem inpsum", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        this.categoriaReposytory.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroReposytory.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
    }

}
