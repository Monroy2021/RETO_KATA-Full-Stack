package com.sofka.reto.services;

import com.sofka.reto.dto.DtoLista;
import com.sofka.reto.models.ListaModel;
import com.sofka.reto.repositories.ListaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ListaService {
    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private ListaRepository LISTA_REPOSITORY;

    @Autowired
    private ModelMapper confiMapper;

    public ArrayList<DtoLista> obtenerDtoToDo() {
        List<ListaModel> listaModel = new ArrayList<>();
        List<DtoLista> dtoLista = new ArrayList<>();
        listaModel = (List<ListaModel>) LISTA_REPOSITORY.findAll();
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoLista>) confiMapper.map(listaModel, dtoLista.getClass());
    }

    public DtoLista create(DtoLista dtoLista) {
        ListaModel listEntity = confiMapper.map(dtoLista, ListaModel.class);
        listEntity = LISTA_REPOSITORY.save(listEntity);
        return confiMapper.map(listEntity, DtoLista.class);
    }


}
