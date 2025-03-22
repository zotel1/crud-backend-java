package com.backend.crud.dto;

import com.backend.crud.model.ContenidoModel;

import java.util.ArrayList;
import java.util.List;

public class ActorDto {

    private Long actores_id;
    private String nombre;

    private List<ContenidoModel> contenidos = new ArrayList<>();

    public ActorDto() {}

    public ActorDto(String nombre, List<ContenidoModel> contenidos) {
        this.nombre = nombre;
        this.contenidos = contenidos;
    }

    public Long getActores_id() {
        return actores_id;
    }

    public void setActores_id(Long actores_id) {
        this.actores_id = actores_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ContenidoModel> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<ContenidoModel> contenidos) {
        this.contenidos = contenidos;
    }
}
