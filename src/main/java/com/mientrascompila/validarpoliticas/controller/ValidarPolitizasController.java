package com.mientrascompila.validarpoliticas.controller;

import com.mientrascompila.validarpoliticas.services.ValidarPoliticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ALEJANDRO on 10/04/2017.
 */

@RestController
@RequestMapping(value = "mientrascompila/validador/politicas")
public class ValidarPolitizasController {

    @Autowired
    private ValidarPoliticasService validarPoliticasService;

    @RequestMapping(value = "/{idEmpleado}", method = RequestMethod.POST)
    public  String valdiarPolitica(@PathVariable("idEmpleado") String idEmpleado){

        return validarPoliticasService.validarPolitica(idEmpleado);

    }


}
