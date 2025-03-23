package com.backend.crud.service;

import com.backend.crud.model.CategoriaModel;
import com.backend.crud.repository.ActorRepository;
import com.backend.crud.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaModel> obtenercategorias(){
        return categoriaRepository.findAll();
    }

}
