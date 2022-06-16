package com.sofka.reto.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * clase dto para que el usuario no
 * haga contacto directo con la entidad
 */

public class DtoLista {

    /**
     * atributo id
     */
    private Long id;

    /**
     * atributo nombre de la lista
     */
    @NotBlank
    @Size(max = 300)
    private String nombre;

    /**
     * Controlador vacio
     */
    public DtoLista() {
    }

    /**
     * Controlador solo con el parametro id
     *
     * @param id - recibe el id
     */
    public DtoLista(Long id) {
        this.id = id;
    }

    /**
     * Controlador solo como parametro el nombre de la lista
     *
     * @param nombre - recibe el nombre de la lista
     */
    public DtoLista(String nombre) {
        this.nombre = nombre;
    }

    /**
     * constrolador con todod los parametros
     *
     * @param id     - recibe el id
     * @param nombre - recibe el nombre de la lista
     */
    public DtoLista(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
    public String getNombre() {
        return nombre;
    }

    /**
     * modificar el nombre
     *
     * @param nombre - recibe el nombre a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
