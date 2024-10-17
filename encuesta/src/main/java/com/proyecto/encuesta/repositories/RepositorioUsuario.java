package com.proyecto.encuesta.repositories;


import com.proyecto.encuesta.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

    List<Usuario> findByNombre(String Nombre);

    Usuario findById(long id);
}


