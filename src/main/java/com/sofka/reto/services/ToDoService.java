package com.sofka.reto.services;

import com.sofka.reto.dto.DtoToDo;
import com.sofka.reto.models.ToDoModel;
import com.sofka.reto.repositories.ToDoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {

    /**
     * Inyeccion del repositorio
     */
    @Autowired
    private ToDoRepository todoRepository;


    /**
     * Inyeccion del mapper
     */
    @Autowired
    ModelMapper modelMapper;

    /**
     * Obtener todas las listas, se devuelve el objeto dto
     * y no la entidad
     *
     * @return
     */
    public ArrayList<DtoToDo> obtenerToDoDto() {
        List<ToDoModel> modToDo = new ArrayList<>();
        List<DtoToDo> dtoToDo = new ArrayList<>();
        modToDo = (List<ToDoModel>) todoRepository.findAll();
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoToDo>) modelMapper.map(modToDo, dtoToDo.getClass());
    }

    /**
     * Obtener las tareas con el id de la lista
     *
     * @param id - recibe el id
     * @return - devuelve la lista
     */
    public ArrayList<DtoToDo> obtenerToDoAllId(Long id) {
        List<ToDoModel> modToDo = new ArrayList<>();
        List<DtoToDo> dtoToDo = new ArrayList<>();
        modToDo = todoRepository.findAllId(id);
        //Mapear la entidad y devolver el objeto
        return (ArrayList<DtoToDo>) modelMapper.map(modToDo, dtoToDo.getClass());
    }

    /**
     * Crear una lista, devuelve igual el objecto y no la entidad
     *
     * @param dtoToDo - recibe el onjeto
     * @return
     */
    public DtoToDo create(DtoToDo dtoToDo) {
        ToDoModel listEntity = modelMapper.map(dtoToDo, ToDoModel.class);
        listEntity = todoRepository.save(listEntity);
        return modelMapper.map(listEntity, DtoToDo.class);
    }

    /**
     * Eliminar un elemento de la lista
     *
     * @param id - recibe el id a eliminar
     * @return - retorna valor boleano
     */
    public boolean eliminarToDo(Long id) {
        try {
            todoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
