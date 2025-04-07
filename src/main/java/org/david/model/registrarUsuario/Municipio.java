package org.david.model.registrarUsuario;

import org.david.model.Catalogo;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

import static org.david.model.registrarUsuario.Estado.estados;

public class Municipio extends Catalogo {
    protected static List<Municipio> municipios = new ArrayList<>();
    private static Municipio instanciaMunicipio;
    private Estado estado;
    private static Integer idCambio = 0;

    private Municipio() { }

    public static Municipio getInstance() {
        if (instanciaMunicipio == null) {
            instanciaMunicipio = new Municipio();
        }
        return instanciaMunicipio;
    }

    public Municipio(String nombre, Estado estado) {
        super(++idCambio, nombre);
        this.estado = estado;
    }

    public void agregarMunicipio() {
        System.out.println("--Agregar municipio--");
        System.out.println("Nombre municipio: ");
        String nombreNuevo = ReadUtil.leerTexto();
        System.out.println("Ligando a un estado: ");
        Estado estado = (Estado) buscarPorID(estados);
        if(estado != null) municipios.add(new Municipio(nombreNuevo, estado));
    }

    public void eliminarMunicipio() {
        Municipio municipioBorrar = (Municipio) buscarPorID(municipios);
        if (municipioBorrar != null) municipios.remove(municipioBorrar);
    }

    public void modificarMunicipio() {
        Municipio municipioEditar = (Municipio) buscarPorID(municipios);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if (municipioEditar != null) municipioEditar.setNombre(nuevoNombre);
    }

    public void verMunicipios() {
        if (municipios != null) municipios.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(municipios, "municipios");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(municipios, "municipios");
    }


    @Override
    public String toString() {
        return "Municipio: " + nombre + " (ID: " + id + ")" + " (ESTADO: " + estado + ")";
    }
}