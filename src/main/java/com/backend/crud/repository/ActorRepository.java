package com.backend.crud.repository;

import com.backend.crud.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<ActorModel, Long> {
    List<ActorModel> findByNombreContainingIgnoreCase(String nombre);
}
