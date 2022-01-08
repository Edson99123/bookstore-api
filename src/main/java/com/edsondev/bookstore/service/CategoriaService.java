package com.edsondev.bookstore.service;

import com.edsondev.bookstore.domain.Categoria;
import com.edsondev.bookstore.repositories.CategoriaReposytory;
import com.edsondev.bookstore.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaReposytory reposytory;

    public Categoria findById(Long id){
        Optional<Categoria> obj = reposytory.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não enontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
