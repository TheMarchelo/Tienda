/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcelo
 */
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}
