package org.david.vista;

import org.david.interfaces.Ejecutable;
import org.david.util.ReadUtil;

public class Consola implements Ejecutable {
    private static final Consola instancia = new Consola(); // Instancia única

    private Consola() {} // Constructor privado

    public static Consola getInstance() {
        return instancia;
    }

    @Override
    public void ejecutar() {
        boolean enCatalogo = true;
        while (enCatalogo) {
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
                    enCatalogo = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

}

