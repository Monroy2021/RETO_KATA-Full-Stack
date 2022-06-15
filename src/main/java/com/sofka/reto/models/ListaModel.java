package com.sofka.reto.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ListaModel {

    //Generando constructores
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(length = 15, nullable = false, unique = true)
    private String Nombre;


    public ListaModel(Long id, String nombre) {
        Id = id;
        Nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }




}
