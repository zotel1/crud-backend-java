package com.backend.crud.controller;

import com.backend.crud.dto.ActorDto;
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

    @GetMapping
    public ResponseEntity<List<ActorDto>> getAllActores() {
        try {
            List<ActorDto> actores = actorService.getAllActores();
            return ResponseEntity.ok(actores);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}
