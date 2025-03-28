package org.david.vista;

import org.david.util.EntidadFactory;
import org.david.util.ReadUtil;

import static org.david.vista.Menu.procesarOpcion;

public class MenuConsola {
    public static void mostrarMenu() {
        System.out.println("1. Ejecutar Consola");
        System.out.println("2. Ejecutar Ventana");
        System.out.println("3. Salir");
        int opcion = ReadUtil.readInt("Seleccione una opción: ");
        procesarOpcion(opcion);
    }

    public static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                new MenuConsola().mostrarMenu();
                break;
            case 2:
                new Ventana().ejecutar();
            case 3:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}