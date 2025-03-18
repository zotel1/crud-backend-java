package com.backend.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "generos")
public class Generos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long generos_id;

    @Column(nullable = false)
    private String generos_nombre;

    public Generos() {}

    public Generos(String generos_nombre) {
        this.generos_nombre = generos_nombre;
    }

    public Long getGeneros_id() {
        return generos_id;
    }

    public void setGeneros_id(Long generos_id) {
        this.generos_id = generos_id;
    }

    public String getGeneros_nombre() {
        return generos_nombre;
    }

    public void setGeneros_nombre(String generos_nombre) {
        this.generos_nombre = generos_nombre;
    }
}
