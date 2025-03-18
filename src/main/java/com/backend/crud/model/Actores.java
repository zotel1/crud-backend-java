package com.backend.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "actores")
public class Actores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actores_id;

    @Column(nullable = false)
    private String actores_nombre;

    public Actores() {}

    public Actores(String actores_nombre){
        this.actores_nombre = actores_nombre;
    }

    public Long getActores_id() {
        return actores_id;
    }

    public void setActores_id(Long actores_id) {
        this.actores_id = actores_id;
    }

    public String getActores_nombre() {
        return actores_nombre;
    }

    public void setActores_nombre(String actores_nombre) {
        this.actores_nombre = actores_nombre;
    }
}
