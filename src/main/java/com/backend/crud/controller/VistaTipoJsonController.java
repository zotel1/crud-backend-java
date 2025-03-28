package com.backend.crud.controller;

import com.backend.crud.model.CategoriaModel;
import com.backend.crud.model.ContenidoModel;
import com.backend.crud.service.VistaTipoJsonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        List<ContenidoModel> resultado = vistaTipoJsonService.buscarPorId(id);
        if (resultado.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron resultados para este ID.");
        }

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/genero/{genero}")
    public ResponseEntity<?> buscarPorGenero(@PathVariable String genero) {
        List<ContenidoModel> resultado = vistaTipoJsonService.buscarPorId(genero);
        if (resultado.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron resultados para este género.");
        }

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<?> buscarPorCategoria(@PathVariable String categoria) {
        List<ContenidoModel> resultado = vistaTipoJsonService.buscarPorCategoria(categoria);
        if (resultado.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron resultados para esta categoría.");
        }
        return ResponseEntity.ok(resultado);
    }
}
