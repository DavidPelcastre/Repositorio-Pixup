package org.david.vista;

public enum MenuGestion {
    ALTA("Alta"),
    BAJA("Baja"),
    VER("Ver"),
    ACTUALIZA("Actualizar"),
    SALIR("Salir");

    private final String descripcion;

    MenuGestion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
