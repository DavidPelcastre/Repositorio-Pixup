package org.david.model;

public class Municipio {
    private int id;
    private String nombre;
    private int idEstado;

    public Municipio() {
    }

    public Municipio(int id, String nombre, int idEstado) {
        this.id = id;
        this.nombre = nombre;
        this.idEstado = idEstado;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getIdEstado() { return idEstado; }

    public void setIdEstado(int idEstado) { this.idEstado = idEstado; }

}
