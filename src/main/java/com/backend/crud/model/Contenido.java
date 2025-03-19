package com.backend.crud.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // Indicamos que esta clase representa una tabla en la base de datos
@Table(name = "contenido") // Nombre de la tabla
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autroincremental
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String resumen;

    private int temporadas;

    private String poster;

    private String trailer;

    // Relación con Categoría (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    // Relación con Generos (ManyToMany)
    @ManyToMany
    @JoinTable(
            name = "contenido_genero",
            joinColumns = @JoinColumn(name = "contenido_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )

    private List<Genero> generos = new ArrayList<>();

    // Relación con Actores (ManyToMany)
    @ManyToMany
    @JoinTable(
            name = "contenido_actores",
            joinColumns = @JoinColumn(name = "contenido_id"),
            inverseJoinColumns = @JoinColumn(name = "actores_id")
    )

    private List<Actor> actores = new ArrayList<>();

    // Constructor vacío (necesario para JPA)
    public Contenido() {}

    // Constructor con parámetros
    public Contenido(String titulo, String resumen, int temporadas, String poster, String trailer, Categoria categoria) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.temporadas = temporadas;
        this.poster = poster;
        this.trailer = trailer;
        this.categoria = categoria;

    }

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

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
}
