package com.mientrascompila.validarpoliticas.services;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by ALEJANDRO on 10/04/2017.
 */

@Service
public class ValidarPoliticasService {

    /**
     * Metodo que valida las politicas de negocio para generar el pago a un empleado.
     * @param idEmpleado
     * @return
     */
    public String validarPolitica(String idEmpleado) {

        // Se simula un proceso de negocio que dura 10 segundos y retorna un id de la validacion.
        Random rnd = new Random();
        String validacion = "Politica Validada ";
        String valiacionRespuesta ="";
        try{

            Thread.sleep(10000);
            valiacionRespuesta = validacion + rnd.nextInt();

        }catch (Exception e){}

        return valiacionRespuesta;


    }

}
