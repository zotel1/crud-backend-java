package com.backend.crud.model;

import jakarta.persistence.*;

@Entity // Indicamos que esta clase representa una tabla en la base de datos
@Table(name = "peliculas") // Nombre de la tabla
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autroincremental
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String director;
    private int anio;

    // Constructor vacío (necesario para JPA)
    public Pelicula() {}

    // Constructor con parámetros
    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
