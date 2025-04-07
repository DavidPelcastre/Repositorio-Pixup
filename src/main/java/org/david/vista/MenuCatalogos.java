package org.david.vista;

public enum MenuCatalogos {
    ESTADO(1),
    MUNICIPIO(2),
    COLONIA(3),
    ARTISTA(4),
    DISQUERA(5),
    GENERO_MUSICAL(6),
    DISCO(7),
    CANCION(8),
    SALIR(9),
    OPCION_ERRONEA(10);

    private final int id;


    MenuCatalogos(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static MenuCatalogos getById(int opcion) {
        return switch (opcion) {
            case 1 -> ESTADO;
            case 2 -> MUNICIPIO;
            case 3 -> COLONIA;
            case 4 -> ARTISTA;
            case 5 -> DISQUERA;
            case 6 -> GENERO_MUSICAL;
            case 7 -> DISCO;
            case 8 -> CANCION;
            case 9 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }
}
