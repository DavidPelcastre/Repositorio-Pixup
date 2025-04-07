package org.david.vista;

import org.david.interfaces.Ejecutable;
/*
public enum MenuGestion {
    ALTAS(1, ManejadorCatalogos.getInstance()),
    BAJAS(2, ManejadorCatalogos.getInstance()),
    VER(3, ManejadorCatalogos.getInstance()),
    ACTUALIZAR(4, ManejadorCatalogos.getInstance()),
    SALIR(5, null),
    OPCION_ERRONEA(6, null);

    private final Integer id;
    private final Ejecutable ejecutable;

    // 👇 Esta es la variable que agregamos para guardar la opción actual seleccionada
    private static MenuGestion current;

    MenuGestion(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }

    public static MenuGestion getById(int opcion) {
        switch (opcion) {
            case 1 -> current = ALTAS;
            case 2 -> current = BAJAS;
            case 3 -> current = VER;
            case 4 -> current = ACTUALIZAR;
            case 5 -> current = SALIR;
            default -> current = OPCION_ERRONEA;
        }
        return current;
    }

    public static MenuGestion getCurrent() {
        return current;
    }
}
 */

public enum MenuGestion {
    ALTAS(1),
    BAJAS(2),
    VER(3),
    ACTUALIZAR(4),
    LEER_ARCHIVO(5),
    GUARDAR_ARCHIVO(6),
    SALIR(7),
    OPCION_ERRONEA(8);

    private final Integer id;

    MenuGestion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static MenuGestion getById(int opcion) {
        return switch (opcion) {
            case 1 -> ALTAS;
            case 2 -> BAJAS;
            case 3 -> VER;
            case 4 -> ACTUALIZAR;
            case 5 -> LEER_ARCHIVO;
            case 6 -> GUARDAR_ARCHIVO;
            case 7 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }

}