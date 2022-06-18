package com.sofka.reto.models;


import javax.persistence.*;

@Entity
@Table(name = "lista_tarea")
public class ToDoModel {
    /**
     * atributo id, clave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * atributo nombre de la lista
     */
    @Column(length = 300, nullable = false, name = "task")
    private String task;

    /**
     * Atributo completado
     */
    @Column(nullable = false, name = "complete")
    private Boolean complete;

    /**
     * Relacion muchos a uno
     * muchas tareas pueden pertenecer a una sola lista
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_lista")
    private ListaModel lista;

    /**
     * Constructor vacio
     */
    public ToDoModel() {
    }

    /**
     * Constructor con un parametro
     *
     * @param id - recibe el id
     */
    public ToDoModel(Long id) {
        this.id = id;
    }

    /**
     * Constructor con un parametro
     *
     * @param task - recibe la tarea
     */
    public ToDoModel(String task) {
        this.task = task;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param id     - recibe el id
     * @param task - recibe la tarea
     */
    public ToDoModel(Long id, String task, Boolean complete, ListaModel lista) {
        this.id = id;
        this.task = task;
        this.complete = complete;
        this.lista = lista;
    }

    /**
     * Constructor cons todos los parametros
     *
     * @param task - recibe la tarea
     * @param lista - recibe el id de la tarea
     */
    public ToDoModel(String task, ListaModel lista) {
        this.task = task;
        this.lista = lista;
    }

    /**
     * Getter para el id
     *
     * @return - retorna el id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter para el id
     *
     * @param id - recibe el id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter para las tareas
     *
     * @return - retorna la tarea
     */
    public String getTask() {
        return task;
    }

    /**
     * Setter para las tareas
     *
     * @param tareas - recibe la tarea
     */
    public void setTask(String tareas) {
        this.task = tareas;
    }

    /**
     * Getter para saber si la tarea esta completa
     * @return - devuelve un boleano
     */
    public Boolean getComplete() {
        return complete;
    }

    /**
     * Setter para modificar la tarea si esta completa o no
     * @param complete - recibe un valor boleano
     */
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * Getter para el objeto de la lista
     *
     * @return
     */
    public ListaModel getLista() {
        return lista;
    }

    /**
     * Setter para el objeto de la lista
     *
     * @param lista - recibe el objeto
     */
    public void setLista(ListaModel lista) {
        this.lista = lista;
    }
}
