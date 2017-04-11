package com.mientrascompila.validarpoliticas.controller;

import com.mientrascompila.validarpoliticas.message.ValidacionRequest;
import com.mientrascompila.validarpoliticas.services.ValidarPoliticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ALEJANDRO on 10/04/2017.
 */

@RestController
@RequestMapping(value = "mientrascompila/validador/politicas")
public class ValidarPolitizasController {

    @Autowired
    private ValidarPoliticasService validarPoliticasService;

    @RequestMapping(value = "/validar", method = RequestMethod.POST)
    public  String valdiarPolitica(@RequestBody ValidacionRequest validacionRequest){

        return validarPoliticasService.validarPolitica(validacionRequest.getIdEmpleado());

    }


}
