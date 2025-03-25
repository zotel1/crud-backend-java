package com.backend.crud.service;

import com.backend.crud.model.ContenidoModel;
import com.backend.crud.repository.VistaTipoJsonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VistaTipoJsonService {
    private final VistaTipoJsonRepository vistaTipoJsonRepository;

    public VistaTipoJsonService(VistaTipoJsonRepository vistaTipoJsonRepository) {
        this.vistaTipoJsonRepository = vistaTipoJsonRepository;
    }

    public List<ContenidoModel> obtenerCategorias() {
        return vistaTipoJsonRepository.obtenerCategorias();
    }

    public List<ContenidoModel> obtenerCatalogo() {
        return vistaTipoJsonRepository.obtenerCatalogo();
    }

    public List<ContenidoModel> buscarPorId(Long id) {
        return vistaTipoJsonRepository.buscarPorId(id);
    }

    public List<ContenidoModel> buscarPorGenero(String genero) {
        return vistaTipoJsonRepository.buscarPorGenero(genero);
    }

    public List<ContenidoModel> buscarPorCategoria(String categoria) {
        return vistaTipoJsonRepository.buscarPorCategoria(categoria);
    }
}
