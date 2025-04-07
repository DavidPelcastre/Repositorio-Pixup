package org.david.model.agregarDisco;

import org.david.model.Catalogo;
import org.david.model.registrarUsuario.Estado;
import org.david.model.sql.implementacion.EstadoJdbcImpl;
import org.david.model.sql.implementacion.GeneroMusicalJdbcImpl;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class GeneroMusical extends Catalogo {
    protected static List<GeneroMusical> generos = new ArrayList<>();
    private static GeneroMusical instanciaGenero;
    private static Integer idCambio = 0;

    public GeneroMusical() { }

    public static GeneroMusical getInstance() {
        if (instanciaGenero == null) {
            instanciaGenero = new GeneroMusical();
        }
        return instanciaGenero;
    }

    public GeneroMusical(String nombre) {
        super(++idCambio, nombre);
    }

    public void agregarGenero() {
        System.out.println("--Agregar género musical--");
        System.out.println("Nombre género: ");
        String nombreNuevo = ReadUtil.leerTexto();
        generos.add(new GeneroMusical(nombreNuevo));
    }

    public void eliminarGenero() {
        GeneroMusical generoBorrar = (GeneroMusical) buscarPorID(generos);
        if (generoBorrar != null) generos.remove(generoBorrar);
    }

    public void modificarGenero() {
        GeneroMusical generoEditar = (GeneroMusical) buscarPorID(generos);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if (generoEditar != null) generoEditar.setNombre(nuevoNombre);
    }

    public void verGeneros() {
        if (generos != null) generos.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(generos, "generos");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(generos, "generos");
    }

    public void leerBaseDatos() {
        generos = GeneroMusicalJdbcImpl.getInstance().findAll();
    }

    public void guardarBaseDatos() {
        GeneroMusicalJdbcImpl db = GeneroMusicalJdbcImpl.getInstance();
        for (GeneroMusical e : generos) {
            db.guardar(e);
        }
    }

    @Override
    public String toString() {
        return "Género musical: " + nombre + " (ID: " + id + ")";
    }
}
