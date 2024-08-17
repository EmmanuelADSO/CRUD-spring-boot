package com.emmanuel.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.demo.modelo.Persona;

@Repository
public interface iPersona extends CrudRepository<Persona, Integer> {

}
