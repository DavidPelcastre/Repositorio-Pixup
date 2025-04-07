package org.david.model.sql.implementacion;

import org.david.model.Catalogo;
import org.david.model.sql.CatalogoJdbc;
import org.david.model.sql.ConexionJdbc;

public abstract class CatalogoJdbcImpl<T extends Catalogo> extends ConexionJdbc<T> implements CatalogoJdbc<T> {
    // Aquí podrías añadir métodos comunes si lo deseas.
}