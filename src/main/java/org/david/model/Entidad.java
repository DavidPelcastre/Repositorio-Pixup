package org.david.model;

import org.david.interfaces.SolicitarDatos;

public abstract class Entidad {
    protected int id;
    protected String nombre;
    protected Estado estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}