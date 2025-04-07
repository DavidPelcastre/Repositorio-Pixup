package org.david.model.agregarDisco;

import org.david.model.Catalogo;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class Artista extends Catalogo {
    protected static List<Artista> artistas = new ArrayList<>();
    private static Artista instanciaArtista;
    private static Integer idCambio = 0;

    private Artista() { }

    public static Artista getInstance() {
        if (instanciaArtista == null) {
            instanciaArtista = new Artista();
        }
        return instanciaArtista;
    }

    public Artista(String nombre) {
        super(++idCambio, nombre);
    }

    public void agregarArtista() {
        System.out.println("--Agregar artista--");
        System.out.println("Nombre artista: ");
        String nombreNuevo = ReadUtil.leerTexto();
        artistas.add(new Artista(nombreNuevo));
    }

    public void eliminarArtista() {
        Artista artistaBorrar = (Artista) buscarPorID(artistas);
        if (artistaBorrar != null) artistas.remove(artistaBorrar);
    }

    public void modificarArtista() {
        Artista artistaEditar = (Artista) buscarPorID(artistas);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if (artistaEditar != null) artistaEditar.setNombre(nuevoNombre);
    }

    public void verArtistas() {
        if (artistas != null) artistas.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(artistas, "artistas");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(artistas, "artistas");
    }




    @Override
    public String toString() {
        return "Artista: " + nombre + " (ID: " + id + ")";
    }
}
