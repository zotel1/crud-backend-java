package com.backend.crud.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "generos")
public class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "generos")
    private List<ContenidoModel> contenidos = new ArrayList<>();

    public GeneroModel() {}

    public GeneroModel(String nombre) {
        this.nombre = nombre;
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
