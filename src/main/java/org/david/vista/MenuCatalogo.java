package org.david.vista;

public enum MenuCatalogo {
    CATALOGO("Catálogo"),
    PENDIENTE("Pendiente"),
    SALIR("Salir");

    private final String descripcion;

    MenuCatalogo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}