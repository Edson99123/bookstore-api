package com.edsondev.bookstore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
//@Table(name = "tb_livro")
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String nome_autor;
    private String texto;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    /**
     * Constructor sem agrs*/
    public  Livro(){}

    /**
     * Constructor com agrs*/
    public Livro(Long id, String titulo, String nome_autor, String texto, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
    }

    /**
     * getters and setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "identificador=" + id +
                ", titulo='" + titulo + '\'' +
                ", nome do autor='" + nome_autor + '\'' +
                ", texto='" + texto + '\'' +
                ", categoria do livro=" + categoria +
                '}';
    }
}
