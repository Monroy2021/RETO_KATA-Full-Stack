package com.sofka.reto;

import com.sofka.reto.dto.DtoToDo;
import com.sofka.reto.models.ListaModel;
import com.sofka.reto.services.ToDoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

public class TestToDoService {

    @Autowired
    ToDoService toDoService;

    @Test
    public void contraintsValidationExceptionTest() {
        // roleServiseImplemet.create(new RoleDto(null));
        ListaModel listamodel = new ListaModel(3L);
        DtoToDo tareaRegistrada = toDoService.create(new DtoToDo("repasar",true, listamodel));
        assertNotNull(tareaRegistrada);
    }
}
