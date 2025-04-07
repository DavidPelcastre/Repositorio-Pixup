package org.david.vista;

import org.david.interfaces.Ejecutable;
public enum MenuCatalogo {
    GESTION(1),
    PENDIENTE(2),
    SALIR(3),
    OPCION_ERRONEA(4);

    private final int id;
    //private final Ejecutable ejecutable;

    MenuCatalogo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static MenuCatalogo getById(int opcion) {
        return switch (opcion) {
            case 1 -> GESTION;
            case 2 -> PENDIENTE;
            case 3 -> SALIR;
            default -> OPCION_ERRONEA;
        };

    }

}