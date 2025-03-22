package com.backend.crud.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // Indicamos que esta clase representa una tabla en la base de datos
@Table(name = "contenido") // Nombre de la tabla
public class ContenidoModel {

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
    private CategoriaModel categoria;

    // Relación con Generos (ManyToMany)
    @ManyToMany
    @JoinTable(
            name = "contenido_genero",
            joinColumns = @JoinColumn(name = "contenido_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )

    private List<GeneroModel> generos = new ArrayList<>();

    // Relación con Actores (ManyToMany)
    @ManyToMany
    @JoinTable(
            name = "contenido_actores",
            joinColumns = @JoinColumn(name = "contenido_id"),
            inverseJoinColumns = @JoinColumn(name = "actores_id")
    )

    private List<ActorModel> actores = new ArrayList<>();

    // Constructor vacío (necesario para JPA)
    public ContenidoModel() {}

    // Constructor con parámetros
    public ContenidoModel(String titulo, String resumen, int temporadas, String poster, String trailer, CategoriaModel categoria) {
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

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

    public List<GeneroModel> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroModel> generos) {
        this.generos = generos;
    }

    public List<ActorModel> getActores() {
        return actores;
    }

    public void setActores(List<ActorModel> actores) {
        this.actores = actores;
    }
}
