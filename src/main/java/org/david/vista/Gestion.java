package org.david.vista;

import org.david.interfaces.Ejecutable;
import org.david.util.ReadUtil;
/*
public class Gestion implements Ejecutable {
    private final Manager manager = new Manager();

    @Override
    public void ejecutar() {
        boolean enGestion = true;

        while (enGestion) {
            Menu.mostrarMenuCatalogo();
            int opcion = ReadUtil.leerEntero();
            MenuCatalogo menu = MenuCatalogo.getById(opcion);

            switch (menu) {
                case GESTION -> {
                    ManejadorCatalogos.getInstance().ejecutar();
                }
                case PENDIENTE -> System.out.println("Funcionalidad pendiente de implementar.");
                case SALIR -> {
                    System.out.println("Saliendo del menú catálogo...");
                    enGestion = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

}
*/
