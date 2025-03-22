package com.backend.crud.dto;

public class CategoriaDto {

    private Long categoria_id;
    private String nombre;

    public CategoriaDto() {}

    public CategoriaDto(String nombre){
        this.nombre = nombre;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
