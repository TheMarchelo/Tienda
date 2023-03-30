package com.tienda.repository;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

    List<Persona> findByApellido1(String apellido1);

    List<Persona> findByApellido1AndApellido2(String apellido1, String apellido2);
    
    Persona findByNombre (String nombre);
    
}
