package com.backend.crud.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actores")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actores_id;

    @Column(nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "actores")
    private List<Contenido> contenidos = new ArrayList<>();

    public Actor() {}

    public Actor(String nombre){
        this.nombre = nombre;
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

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }
}
