package com.backend.crud.dto;

import com.backend.crud.model.ContenidoModel;

import java.util.ArrayList;
import java.util.List;

public class GeneroDto {

    private Long id;
    private String nombre;

    private List<ContenidoModel> contenidos = new ArrayList<>();

    public GeneroDto() {};

    public GeneroDto(String nombre, List<ContenidoModel> contenidos){
        this.nombre = nombre;
        this.contenidos = contenidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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