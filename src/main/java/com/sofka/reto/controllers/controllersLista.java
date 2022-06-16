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
}
