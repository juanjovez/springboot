package com.proyecto.encuesta.repositories;



import com.proyecto.encuesta.models.Opcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioOpcion extends JpaRepository<Opcion, Long> {

    List<Opcion> findByidEncuesta(Long encuesta);

    Opcion findById(long id);
}


