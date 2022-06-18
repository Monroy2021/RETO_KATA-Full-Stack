package com.sofka.reto.repositories;


import com.sofka.reto.models.ToDoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;


/**
 * Inteface para las sentencias del crud
 * entidad todo_list

 */
@Repository
public interface ToDoRepository extends CrudRepository<ToDoModel, Long> {


    /**
     * Sentencia sql para traer las tareas con el id de la lista
     * @param id - recibe el id
     * @return - retorna la lista
     */
    @Query(value = "SELECT * FROM lista_tarea WHERE id_lista = ?1", nativeQuery = true)
    public abstract ArrayList<ToDoModel> findAllId(Long id);

}

