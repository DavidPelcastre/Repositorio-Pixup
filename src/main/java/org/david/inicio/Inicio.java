package org.david.inicio;

import org.david.vista.Menu;
import org.david.vista.MenuConsola;

public class Inicio {
    public static void main(String[] args) {
        boolean ejecutando = true;

        while (ejecutando) {
            int opcionPrincipal = MenuConsola.getById(Menu.mostrarMenuPrincipal()).getId();
            MenuConsola menu = MenuConsola.getById(opcionPrincipal);

            if (menu == MenuConsola.SALIR) {
                ejecutando = false;
            } else if (menu.getEjecutable() != null) {
                menu.getEjecutable().ejecutar();
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}

