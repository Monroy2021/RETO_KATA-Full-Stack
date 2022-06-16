package com.sofka.reto.dto;

import com.sofka.reto.models.ListaModel;

public class DtoToDo {

    /**
     * atributo id
     */
    private Long id;

    /**
     * atributo nombre de la lista
     */
    private String tareas;

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
     *
     * @param id - recibe el id
     */
    public DtoToDo(Long id) {
        this.id = id;
    }

    /**
     * Constructor con un parametro
     *
     * @param tareas - recibe la tarea
     */
    public DtoToDo(String tareas) {
        this.tareas = tareas;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param id     - recibe el id
     * @param tareas - recibe la tarea
     */
    public DtoToDo(Long id, String tareas, ListaModel lista) {
        this.id = id;
        this.tareas = tareas;
        this.lista = lista;
    }

    public Long getId() {
        return id;
    }

    /**
     * Getter para el id
     *
     * @return - retorna el id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter para las tareas
     *
     * @return - retorna la tarea
     */
    public String getTareas() {
        return tareas;
    }

    /**
     * Setter para las tareas
     *
     * @param tareas - recibe la tarea
     */
    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    /**
     * Getter para el objeto de la lista
     *
     * @return
     */
    public ListaModel getList() {
        return lista;
    }

    /**
     * Setter para el objeto de la lista
     *
     * @param lista - recibe el objeto
     */
    public void setList(ListaModel lista) {
        this.lista = lista;
    }
}
