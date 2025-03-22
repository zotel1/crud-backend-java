package com.backend.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contenido_actores")
public class ContenidoActoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contenido_actores_id;

    private int contenido_id;

    private int actores_id;

    public ContenidoActoresModel() {}

    public ContenidoActoresModel(int contenido_id, int actores_id) {
        this.contenido_id = contenido_id;
        this.actores_id = actores_id;
    }

    public Long getContenido_actores_id() {
        return contenido_actores_id;
    }

    public void setContenido_actores_id(Long contenido_actores_id) {
        this.contenido_actores_id = contenido_actores_id;
    }

    public int getContenido_id() {
        return contenido_id;
    }

    public void setContenido_id(int contenido_id) {
        this.contenido_id = contenido_id;
    }

    public int getActores_id() {
        return actores_id;
    }

    public void setActores_id(int actores_id) {
        this.actores_id = actores_id;
    }
}
