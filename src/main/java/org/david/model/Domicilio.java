package org.david.model;

public class Domicilio {
    private int id;
    private String calle;
    private String numExterior;
    private String numInterior;
    private Usuario usuario;
    private Colonia colonia;
    private TipoDomicilio tipoDomicilio;
    public Domicilio() {}
    public Domicilio(int id, String calle, String numExterior, String numInterior, Usuario usuario, Colonia colonia, TipoDomicilio tipoDomicilio) {
        this.id = id;
        this.calle = calle;
        this.numExterior = numExterior;
        this.numInterior = numInterior;
        this.usuario = usuario;
        this.colonia = colonia;
        this.tipoDomicilio = tipoDomicilio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumExterior() {
        return numExterior;
    }
    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }
    public String getNumInterior() {
        return numInterior;
    }
    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Colonia getColonia() {
        return colonia;
    }
    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }
    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }
    public void setTipoDomicilio(TipoDomicilio tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }

}
