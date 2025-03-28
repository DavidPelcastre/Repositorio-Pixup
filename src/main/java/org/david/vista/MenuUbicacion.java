package org.david.vista;

public enum MenuUbicacion {
    ESTADO("Estado"),
    MUNICIPIO("Municipio"),
    COLONIA("Colonia"),
    SALIR("Salir");

    private final String descripcion;

    MenuUbicacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
