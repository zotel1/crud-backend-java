package com.backend.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contenido_genero")
public class ContenidoGenero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contenido_genero_id;

    private int contenido_id;

    private int genero_id;

    public ContenidoGenero() {}

    public ContenidoGenero(int contenido_id, int genero_id) {
        this.contenido_id = contenido_id;
        this.genero_id = genero_id;
    }

    public Long getContenido_genero_id() {
        return contenido_genero_id;
    }

    public void setContenido_genero_id(Long contenido_genero_id) {
        this.contenido_genero_id = contenido_genero_id;
    }

    public int getContenido_id() {
        return contenido_id;
    }

    public void setContenido_id(int contenido_id) {
        this.contenido_id = contenido_id;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }
}
