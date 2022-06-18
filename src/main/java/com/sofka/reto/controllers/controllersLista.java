package com.sofka.reto.controllers;


import com.sofka.reto.dto.DtoLista;
import com.sofka.reto.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/list")
public class controllersLista {

    @Autowired
    private ListaService listaService;

    @PostMapping("/save")
    public DtoLista create(@RequestBody DtoLista dtoList) {
        return this.listaService.create(dtoList);
    }

    @GetMapping("")
    public ArrayList<DtoLista> obtenerDtoToDo() {
        return listaService.obtenerDtoToDo();
    }


    /**
     * Elimina una lista con id
     * @param id - recibe el id de la lista

     */
    @DeleteMapping(path = "/{id}")
    public String eliminarListaPorId(@PathVariable("id") Long id) {
        boolean ok = this.listaService.eliminarLista(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
