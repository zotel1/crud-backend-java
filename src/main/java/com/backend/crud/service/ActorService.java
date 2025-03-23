package com.backend.crud.service;

import com.backend.crud.model.ActorModel;
import com.backend.crud.repository.ActorRepository;
import com.backend.crud.repository.CategoriaRepository;
import com.backend.crud.repository.ContenidoRepository;
import com.backend.crud.repository.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<ActorModel> obtenerActores(){
        return actorRepository.findAll();
    }

    public List<ActorModel> buscarActorNombre(String nombre){
        return actorRepository.findByNombreContainingIgnoreCase(nombre);
    }
}
