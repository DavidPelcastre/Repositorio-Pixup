package org.david.util;

import org.david.model.Entidad;

public interface Registros {
    void addEntidad(Entidad entidad);
    void removeEntidad(Integer id);
    void updateEntidad(Integer id, Entidad nuevaEntidad);
    void imprimir();
}
