package org.demre.medidorclave;

public class Presentador {
    private Modelo modelo;

    public void evaluarContrasena(String password){

        int nivelFuerza = modelo.validarClave(password);

        if (nivelFuerza==Modelo.DEBIL){

        }else if (nivelFuerza==Modelo.MEDIA){

        } else if (nivelFuerza==Modelo.FUERTE){

        }   else {

        }

    }
}
