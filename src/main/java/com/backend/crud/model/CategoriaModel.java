package com.backend.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoria_id;

    @Column(nullable = false)
    private String nombre;

    public CategoriaModel() {}

    public CategoriaModel(String nombre) {
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
