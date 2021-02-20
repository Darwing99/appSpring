package com.example.appSpring.interfaces;

import com.example.appSpring.modelo.Persona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Ipersona extends CrudRepository<Persona,Integer>  {
    
}
