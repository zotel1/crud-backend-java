package com.backend.crud.controller;

import com.backend.crud.dto.ActorDto;
import com.backend.crud.model.ActorModel;
import com.backend.crud.service.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/actores")
@CrossOrigin("*")
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    // Obtenemos todos los actores
    @GetMapping
    public ResponseEntity<?> obtenerActores() {
        List<ActorModel> actores = actorService.obtenerActores();
        if (actores.isEmpty()) {
            return ResponseEntity.status(404).body("No hay actores registrados.");
        }
        return ResponseEntity.ok(actores);
    }

    // Buscamos actores por nombre
    @GetMapping("/{nombre}")
    public ResponseEntity<?> buscarActorNombre(@PathVariable String nombre) {
        if (nombre.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("El nombre debe tener al menos 1 carácter.");
        }

        List<ActorModel> actores = actorService.buscarActorNombre(nombre);
        if (actores.isEmpty()) {
            return ResponseEntity.status(404).body("No hay actores registrados.");
        }

        return ResponseEntity.ok(actores);
    }
}
