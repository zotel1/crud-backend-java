package com.backend.crud.dto;

import com.backend.crud.model.ActorModel;
import com.backend.crud.model.CategoriaModel;

import java.util.ArrayList;
import java.util.List;

public class ContenidoDto {

    private Long id;
    private String titulo;
    private String resumen;
    private int temporadas;
    private String poster;
    private String trailer;

    private CategoriaModel categoriaModel;

    private List<ActorModel> actores = new ArrayList<>();

    public ContenidoDto() {}

    public ContenidoDto(String titulo, String resumen, int temporadas, String poster, String trailer, CategoriaModel categoriaModel, List<ActorModel> actores){
        this.titulo = titulo;
        this.resumen = resumen;
        this.temporadas = temporadas;
        this.poster = poster;
        this.trailer = trailer;
        this.categoriaModel = categoriaModel;
        this.actores = actores;
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

    public CategoriaModel getCategoriaModel() {
        return categoriaModel;
    }

    public void setCategoriaModel(CategoriaModel categoriaModel) {
        this.categoriaModel = categoriaModel;
    }

    public List<ActorModel> getActores() {
        return actores;
    }

    public void setActores(List<ActorModel> actores) {
        this.actores = actores;
    }
}
