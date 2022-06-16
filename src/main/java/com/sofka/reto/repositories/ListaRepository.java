package com.sofka.reto.repositories;


import com.sofka.reto.models.ListaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Inteface para las sentencias del crud
 * tabla list
 */
@Repository

public interface ListaRepository extends CrudRepository<ListaModel, Long> {

}
