package com.emmanuel.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emmanuel.demo.interfaceService.IpersonaService;
import com.emmanuel.demo.interfaces.iPersona;
import com.emmanuel.demo.modelo.Persona;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private iPersona data;
    
    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res = 0;
        Persona persona = data.save(p);
        if (persona != null) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}

