package com.sofka.reto.services;

import com.sofka.reto.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ToDoService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private ToDoRepository todoRepository;
}
