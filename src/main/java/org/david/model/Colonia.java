package org.david.model;

public class Colonia {
    private int idColonia;
    private String nombre;
    private String cp;
    private Municipio municipio;

    public Colonia() {
    }

    public Colonia(int idColonia, String nombre, String cp, Municipio municipio) {
        this.idColonia = idColonia;
        this.nombre = nombre;
        this.cp = cp;
        this.municipio = municipio;
    }

    public int getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(int idColonia) {
        this.idColonia = idColonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

}
