package org.david.vista;

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
    }

}
