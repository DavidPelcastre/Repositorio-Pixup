package org.david.vista;

import org.david.interfaces.Ejecutable;

public class Ventana implements Ejecutable {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Consola...");
    }
}