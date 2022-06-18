package com.sofka.reto;

import com.sofka.reto.dto.DtoLista;
import com.sofka.reto.services.ListaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestListaService {

    @Autowired
    ListaService listService;

    @Test
    public void contraintsValidationExceptionTest() {
        assertThrows(ConstraintViolationException.class, () -> {
            // roleServiseImplemet.create(new RoleDto(null));
            listService.create(new DtoLista("Prueba 1"));
        });
    }
}
