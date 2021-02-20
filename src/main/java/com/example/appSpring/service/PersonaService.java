package com.example.appSpring.service;

import com.example.appSpring.modelo.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appSpring.interfaceService.IPersonasService;
import com.example.appSpring.interfaces.Ipersona;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements IPersonasService{
    @Autowired
    private Ipersona data;
	@Override
	public List<Persona> listar() {
	

		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
    
}
