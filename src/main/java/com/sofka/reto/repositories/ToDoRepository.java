package com.sofka.reto.repositories;

import com.sofka.reto.dto.DtoToDo;
import com.sofka.reto.models.ListaModel;
import com.sofka.reto.models.ToDoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;


/**
 * Inteface para las sentencias del crud
 * entidad todo_list

 */
@Repository
public interface ToDoRepository extends CrudRepository<ToDoModel, Long> {

}

