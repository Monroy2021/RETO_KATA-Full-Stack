package com.sofka.reto.dto;

import com.sofka.reto.models.ListaModel;
import com.sofka.reto.models.ToDoModel;
import org.springframework.beans.factory.ListableBeanFactory;


public class DtoToDo {


    /**
     * atributo id
     */
    private Long id;

    /**
     * atributo nombre de la lista
     */
    private String task;

    /**
     * Atributo boleano para saber si la atrea esta completada
     */
    private Boolean complete;

    /**
     * Relacion muchos a uno
     */
    private ListaModel lista;

    /**
     * Constructor vacio
     */
    public DtoToDo() {
    }

    /**
     * Constructor con un parametro

     */
    public DtoToDo(Long id) {
        this.id = id;
    }

    /**
     * Constructor con un parametro

     */
    public DtoToDo(String tareas) {
        this.task = tareas;
    }

    /**
     * Constructor cons todos los parametros
     */
    public DtoToDo(Long id, String task, Boolean complete, ListaModel lista) {
        this.id = id;
        this.task = task;
        this.complete = complete;
        this.lista = lista;
    }

    /**
     * Constructor cons todos los parametros
     */
    public DtoToDo(String task, ListaModel lista) {
        this.task = task;
        this.lista = lista;
    }

    public DtoToDo(String task, Boolean complete, ListaModel lista) {
        this.task = task;
        this.complete = complete;
        this.lista = lista;
    }


    public Long getId() {
        return id;
    }

    /**
     * Getter para el id

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter para las tareas

     */
    public String getTask() {
        return task;
    }

    /**
     * Setter para las tareas

     */
    public void setTask(String tareas) {
        this.task = tareas;
    }

    /**
     * Getter para saber si la tarea esta completa
     */
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Setter para modificar la tarea si esta completa o no

     */
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * Getter para el objeto de la lista

     */
    public ListaModel getLista() {
        return lista;
    }

    /**
     * Setter para el objeto de la lista
     */
    public void setLista(ListaModel lista) {
        this.lista = lista;
    }
}
