package com.sofka.reto.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "lista")
public class ListaModel {

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
    @Column(name = "lista_name")
    private String listName;

    /**
     * Hacer referencia a la tabla del many
     */
    @OnDelete(action= OnDeleteAction.CASCADE)
    @OneToMany(mappedBy = "lista")
    private List<ToDoModel> toDoLista;

    /**
     * Controlador vacio
     */
    public ListaModel() {
    }

    /**
     * Controlador solo con el parametro id
     *
     * @param id - recibe el id
     */
    public ListaModel(Long id) {
        this.id = id;
    }

    /**
     * Controlador solo como parametro el nombre de la lista
     *
     * @param listName - recibe el nombre de la lista
     */
    public ListaModel(String listName) {
        this.listName = listName;
    }

    /**
     * constrolador con todod los parametros
     *
     * @param id       - recibe el id
     * @param listName - recibe el nombre de la lista
     */
    public ListaModel(Long id, String listName) {
        this.id = id;
        this.listName = listName;
    }


    /**
     * obtener el id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * modificar el id
     *
     * @param id - recibe el id a modificar
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * obtener el nombre de la lista
     *
     * @return
     */
    public String getListName() {
        return listName;
    }

    /**
     * modificar el nombre
     *
     * @param listName - recibe el nombre a modificar
     */
    public void setListName(String listName) {
        this.listName = listName;
    }



}
