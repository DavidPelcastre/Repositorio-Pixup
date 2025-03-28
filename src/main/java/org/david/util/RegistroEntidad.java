package org.david.util;

import org.david.model.Entidad;

import java.util.ArrayList;
import java.util.List;

public class RegistroEntidad {
    private List<Entidad> entidades = new ArrayList<>();

    public void registrarEntidad(Entidad entidad) {
        entidades.add(entidad);
    }
}
