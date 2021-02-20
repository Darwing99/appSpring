package com.example.appSpring.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.appSpring.modelo.Persona;

public interface IPersonasService {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona p);
    public void delete(int id);
    
}
