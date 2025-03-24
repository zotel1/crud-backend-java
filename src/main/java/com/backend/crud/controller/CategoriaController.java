package com.backend.crud.controller;

import com.backend.crud.model.CategoriaModel;
import com.backend.crud.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // Obtenemos todas las categorias
    @GetMapping
    public ResponseEntity<?> obtenercategorias() {
        List<CategoriaModel> categorias = categoriaService.obtenercategorias();
        if (categorias.isEmpty()) {
            return ResponseEntity.status(404).body("esa categoria no se encuentra en el catalogo.");
        }
        return ResponseEntity.ok(categorias);
    }
}
