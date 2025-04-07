package org.david.model.agregarDisco;

import org.david.model.Catalogo;
import org.david.model.registrarUsuario.Estado;
import org.david.model.sql.implementacion.DisqueraJdbcImpl;
import org.david.model.sql.implementacion.EstadoJdbcImpl;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class Disquera extends Catalogo {
    public static List<Disquera> disqueras = new ArrayList<>();
    private static Disquera instanciaDisquera;
    private static Integer idCambio = 0;

    public Disquera() { }

    public static Disquera getInstance() {
        if (instanciaDisquera == null) {
            instanciaDisquera = new Disquera();
        }
        return instanciaDisquera;
    }

    public Disquera(String nombre) {
        super(++idCambio, nombre);
    }

    public void agregarDisquera() {
        System.out.println("--Agregar disquera--");
        System.out.println("Nombre disquera: ");
        String nombreNuevo = ReadUtil.leerTexto();
        disqueras.add(new Disquera(nombreNuevo));
    }

    public void eliminarDisquera() {
        Disquera disqueraBorrar = (Disquera) buscarPorID(disqueras);
        if (disqueraBorrar != null) disqueras.remove(disqueraBorrar);
    }

    public void modificarDisquera() {
        Disquera disqueraEditar = (Disquera) buscarPorID(disqueras);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if (disqueraEditar != null) disqueraEditar.setNombre(nuevoNombre);
    }

    public void verDisqueras() {
        if (disqueras != null) disqueras.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(disqueras, "disqueras");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(disqueras, "disqueras");
    }

    public void leerBaseDatos() {
        disqueras = DisqueraJdbcImpl.getInstance().findAll();
    }

    public void guardarBaseDatos() {
        DisqueraJdbcImpl db = DisqueraJdbcImpl.getInstance();
        for (Disquera e : disqueras) {
            db.guardar(e);
        }
    }

    @Override
    public String toString() {
        return "Disquera: " + nombre + " (ID: " + id + ")";
    }
}
