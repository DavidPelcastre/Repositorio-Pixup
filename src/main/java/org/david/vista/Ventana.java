package org.david.vista;

import org.david.interfaces.Ejecutable;

public class Ventana implements Ejecutable {
    private static Ventana ventana;
    private Ventana(){}

    public static Ventana getInstance( ) {
        if(ventana==null)
        {
            return new Ventana();
        }
        return ventana;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Ventana...");
        System.out.println("Aún no está disponible ejecutar la ventana :(");
    }
}
