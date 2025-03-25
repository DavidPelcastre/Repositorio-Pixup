package org.david.model;

public class Municipio {
    private int idMunicipio;
    private String nombre;
    private Estado estado;

    public Municipio() {
    }

    public Municipio(int idMunicipio, String nombre, Estado estado) {
        this.idMunicipio = idMunicipio;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
