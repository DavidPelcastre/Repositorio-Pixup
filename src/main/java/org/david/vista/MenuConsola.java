package org.david.vista;


import org.david.interfaces.Ejecutable;

public enum MenuConsola {
    CONSOLA(1, Consola.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    SALIR(3, null),
    OPCION_ERRONEA(4, null);

    private final int id;
    private final Ejecutable ejecutable;

    MenuConsola(int id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public int getId() {
        return id;
    }

    public static MenuConsola getById(int opcion) {
        for (MenuConsola menu : values()) {
            if (menu.getId() == opcion) {
                return menu;
            }
        }
        return OPCION_ERRONEA;
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}
