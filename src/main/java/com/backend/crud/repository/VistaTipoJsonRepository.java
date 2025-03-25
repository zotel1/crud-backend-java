package com.backend.crud.repository;

import com.backend.crud.model.CategoriaModel;
import com.backend.crud.model.ContenidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VistaTipoJsonRepository extends JpaRepository<ContenidoModel, Long> {

    @Query(value = "SELECT * FROM vista_tipo_json ORDER BY id_categoria", nativeQuery = true)
    List<ContenidoModel> obtenerCategorias();


    @Query(value = "SELECT *, CONCAT('http://127.0.0.1:3005/public', poster) AS poster FROM vista_tipo_json", nativeQuery = true)
    List<CategoriaModel> obtenerCatalogo();

    @Query(value = "SELECT *, CONCAT('http://127.0.0.1:3005/public', poster) AS poster FROM vista_tipo_json", nativeQuery = true)
    List<ContenidoModel> buscarPorId(@Param("id") Long id);


    @Query(value = "SELECT *, CONCAT('http://127.0.0.1:3005/public', poster) AS poster FROM vista_tipo_json", nativeQuery = true)
    List<ContenidoModel> buscarPorGenero(@Param("genero") String genero);


    @Query(value = """
SELECT *, CONCAT('http://127.0.0.1:3005/public', poster) AS poster 
FROM vista_tipo_json
WHERE categoria IN (SELECT categoria_nombre FROM Categorias WHERE categoria_nombre = :categoria)
""", nativeQuery = true)
    List<ContenidoModel> buscarPorCategoria(@Param("categoria") String categoria);

}
