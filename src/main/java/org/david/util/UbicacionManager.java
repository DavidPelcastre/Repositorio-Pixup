package org.david.util;

import org.david.model.registrarUsuario.Colonia;
import org.david.model.registrarUsuario.Estado;
import org.david.model.registrarUsuario.Municipio;

import java.util.ArrayList;
import java.util.List;
/*
public class UbicacionManager {
    private List<Estado> estados;

    public UbicacionManager() {
        this.estados = new ArrayList<>();
    }

    public void agregarEstado(Estado estado) {
        estados.add(estado);
    }

    public Estado buscarEstado(int id) {
        for (Estado estado : estados) {
            if (estado.getId() == id) {
                return estado;
            }
        }
        return null;
    }

    public Municipio buscarMunicipio(int idEstado, int idMunicipio) {
        Estado estado = buscarEstado(idEstado);
        if (estado != null) {
            for (Municipio municipio : estado.getMunicipios()) {
                if (municipio.getId() == idMunicipio) {
                    return municipio;
                }
            }
        }
        return null;
    }

    public void agregarMunicipio(int idEstado, Municipio municipio) {
        Estado estado = buscarEstado(idEstado);
        if (estado != null) {
            estado.agregarMunicipio(municipio);
        }
    }

    public void agregarColonia(int idEstado, int idMunicipio, Colonia colonia) {
        Municipio municipio = buscarMunicipio(idEstado, idMunicipio);
        if (municipio != null) {
            municipio.agregarColonia(colonia);
        }
    }

    public List<Estado> getEstados() {
        return estados;
    }
}
*/