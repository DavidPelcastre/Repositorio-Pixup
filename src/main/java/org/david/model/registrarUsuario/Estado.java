
package org.david.model.registrarUsuario;

import org.david.model.Catalogo;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class Estado extends Catalogo {
    private static Integer idCambio = 0;
    protected static List<Estado> estados = new ArrayList<>();
    private static Estado instanciaEstado;

    private Estado(){
    }
    public static Estado getInstance(){
        if(instanciaEstado == null){
            instanciaEstado = new Estado();
        }
        return instanciaEstado;
    }

    public Estado(String nombre) {
        super(++idCambio, nombre);
    }

    public void agregarEstado() {
        System.out.println("--Agregar estado--");
        System.out.println("Nombre estado: ");
        String nombreNuevo = ReadUtil.leerTexto();
        estados.add(new Estado(nombreNuevo));
    }
    public void eliminarEstado(){
        Estado estadoBorrar = (Estado) buscarPorID(estados);
        if(estadoBorrar!=null) estados.remove(estadoBorrar);
    }
    public void modificarEstado(){
        Estado estadoEditar = (Estado) buscarPorID(estados);
        System.out.println("Nuevo nombre: ");
        String nuevoNombre = ReadUtil.leerTexto();
        if(estadoEditar!=null) estadoEditar.setNombre(nuevoNombre);
    }
    public void verEstados(){
        if(estados != null) estados.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(estados, "estados");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(estados, "estados");
    }

    @Override
    public String toString() {
        return "Estado: " + nombre + " (ID: " + id + ")";
    }
}
