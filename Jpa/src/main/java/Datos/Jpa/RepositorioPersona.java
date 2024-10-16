package Datos.Jpa;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepositorioPersona extends CrudRepository<Persona, Long> {

    List<Persona> findByApellido(String apellido);

    Persona findById(long id);
}