package com.proyecto.encuesta.repositories;


import com.proyecto.encuesta.models.Encuesta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioEncuesta extends JpaRepository<Encuesta, Long> {

    List<Encuesta> findBynombreEncuesta(String Nombre);

    Encuesta findById(long id);
}


