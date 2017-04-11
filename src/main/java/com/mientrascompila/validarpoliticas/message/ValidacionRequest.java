package com.mientrascompila.validarpoliticas.message;

/**
 *
 * Mensaje request que inicia el proceso de validacion de politica.
 *
 * Created by abelmeos on 2017/04/11.
 */
public class ValidacionRequest {

    private String idEmpleado;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
