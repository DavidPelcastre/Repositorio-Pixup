package org.david.model.sql;
import org.david.model.Catalogo;

import java.util.List;

public interface CatalogoJdbc<T extends Catalogo> {
    List<T> findAll();
    boolean guardar(T t);
    boolean actualizar(T t);
    boolean eliminar(int id);
}