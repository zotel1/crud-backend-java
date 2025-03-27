package com.backend.crud.controller;

import com.backend.crud.model.CategoriaModel;
import com.backend.crud.model.ContenidoModel;
import com.backend.crud.service.VistaTipoJsonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class VistaTipoJsonController {

    private final VistaTipoJsonService vistaTipoJsonService;

    public VistaTipoJsonController(VistaTipoJsonService vistaTipoJsonService) {
        this.vistaTipoJsonService = vistaTipoJsonService;
    }

    @GetMapping("/categoria")
    public ResponseEntity<?> obtenerCategoria() {
        List<ContenidoModel> categorias = vistaTipoJsonService.obtenerCategorias();
        if (categorias.isEmpty()) {
            return ResponseEntity.status(400).body("No hay categorías disponibles.");
        }
        return ResponseEntity.ok(categorias);
    }

    @GetMapping
    public ResponseEntity<?> obtenerCatalogo() {
        List<ContenidoModel> catalogo = vistaTipoJsonService.obtenerCatalogo();
        return ResponseEntity.ok(catalogo);
    }
}
