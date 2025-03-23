package com.backend.crud.controller;

import com.backend.crud.dto.ActorDto;
import com.backend.crud.model.ActorModel;
import com.backend.crud.service.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
