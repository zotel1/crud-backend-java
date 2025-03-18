package com.backend.crud.model;

import jakarta.persistence.*;

@Entity // Indicamos que esta clase representa una tabla en la base de datos
@Table(name = "contenido") // Nombre de la tabla
public class Contenido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autroincremental
    private Long contenido_id;

    @Column(nullable = false)
    private String titulo;

    private String resumen;

    private int temporadas;

    private String poster;

    private String trailer;

    private int categoria_id;

    // Constructor vacío (necesario para JPA)
    public Contenido() {}

    // Constructor con parámetros
    public Contenido(String titulo, String resumen, int temporadas, String poster, String trailer, int categoria_id) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.temporadas = temporadas;
        this.poster = poster;
        this.trailer = trailer;
        this.categoria_id = categoria_id;

    }


    public Long getContenido_id() {
        return contenido_id;
    }

    public void setContenido_id(Long contenido_id) {
        this.contenido_id = contenido_id;
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

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
}
