package org.david.model.agregarDisco;

import org.david.model.Catalogo;
import org.david.model.registrarUsuario.Colonia;
import org.david.model.registrarUsuario.Municipio;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

import static org.david.model.agregarDisco.Disco.discos;

public class Cancion extends Catalogo {
    protected static List<Cancion> canciones = new ArrayList<>();
    private static Cancion instanciaCancion;
    private String duracion;
    private Disco disco;
    private static Integer idCambio = 0;

    private Cancion() { }

    public static Cancion getInstance() {
        if (instanciaCancion == null) {
            instanciaCancion = new Cancion();
        }
        return instanciaCancion;
    }

    public Cancion(String nombre, String duracion, Disco disco) {
        super(++idCambio, nombre);
        this.duracion = duracion;
        this.disco = disco;
    }

    public void agregarCancion() {
        System.out.println("--Agregar Canción--");
        System.out.println("Nombre canción: ");
        String nombreNuevo = ReadUtil.leerTexto();

        System.out.println("duración: ");
        String duracion = ReadUtil.leerTexto();

        System.out.println("Ligando a un disco: ");
        Disco disco = (Disco) buscarPorID(discos);

        if(disco != null) canciones.add(new Cancion(nombreNuevo, duracion, disco));
    }

    public void eliminarCancion() {
        Cancion cancionBorrar = (Cancion) buscarPorID(canciones);
        if (cancionBorrar != null) canciones.remove(cancionBorrar);
    }

    public void modificarCancion() {
        Cancion cancionEditar = (Cancion) buscarPorID(canciones);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if (cancionEditar != null) cancionEditar.setNombre(nuevoNombre);
    }

    public void verCanciones() {
        if (canciones != null) canciones.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(canciones, "canciones");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(canciones, "canciones");
    }


    @Override
    public String toString() {
        return "Cancion: " + nombre + " (ID: " + id + ")" + " (DISCO: " + disco + ")";
    }
}
