package org.david.model;

public class Estado {
    private int id;
    private String nombre;

    public Estado() {
    }

    public Estado(int idEstado, String nombre) {
        this.id = idEstado;
        this.nombre = nombre;
    }

    public int getIdEstado() {
        return id;
    }

    public void setIdEstado(int idEstado) {
        this.id = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
