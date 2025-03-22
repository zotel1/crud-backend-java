package com.backend.crud.service;

import com.backend.crud.repository.CategoriaRepository;
import com.backend.crud.repository.ContenidoRepository;
import com.backend.crud.repository.GeneroRepository;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    private final CategoriaRepository categoriaRepository;
    private final ContenidoRepository contenidoRepository;
    private final GeneroRepository generoRepository;

}
