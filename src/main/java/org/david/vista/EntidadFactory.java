package org.david.vista;

import org.david.interfaces.Ejecutable;

public class EntidadFactory implements Ejecutable {
    private static final EntidadFactory instancia = new EntidadFactory();

    private EntidadFactory() {}

    public static EntidadFactory getInstance() {
        return instancia;
    }

    @Override
    public void ejecutar() {
        System.out.println("Funcionalidad de entidad en desarrollo...");
    }
}