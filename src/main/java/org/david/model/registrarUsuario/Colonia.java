package org.david.model.registrarUsuario;

import org.david.model.Catalogo;
import org.david.model.sql.implementacion.ColoniaJdbcImpl;
import org.david.model.sql.implementacion.EstadoJdbcImpl;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

import static org.david.model.registrarUsuario.Estado.estados;
import static org.david.model.registrarUsuario.Municipio.municipios;

public class Colonia extends Catalogo {
    protected static List<Colonia> colonias = new ArrayList<>();
    private static Colonia instanciaColonia;
    private Municipio municipio;
    private Integer cp;
    private static Integer idCambio = 0;

    public Colonia() { }
    public static Colonia getInstance() {
        if (instanciaColonia == null) {
            instanciaColonia = new Colonia();
        }
        return instanciaColonia;
    }

    public Colonia(String nombre, Integer cp, Municipio municipio) {
        super(++idCambio, nombre);
        this.municipio = municipio;
        this.cp = cp;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public void setIdMunicipio(int id){
        this.municipio = (Municipio) buscarPorID(municipios, id);
    }
    public int getIdMunicipio(){
        return municipios.indexOf(municipio) + 1;
    }

    public void agregarColonia() {
        System.out.println("--Agregar colonia--");
        System.out.println("Nombre colonia: ");
        String nombreNuevo = ReadUtil.leerTexto();

        System.out.println("codigo postal: ");
        Integer cp = ReadUtil.leerEntero();

        System.out.println("Ligando a un municipio: ");
        Municipio municipio = (Municipio) buscarPorID(municipios);

        if(municipio != null) colonias.add(new Colonia(nombreNuevo, cp, municipio));
    }

    public void eliminarColonia() {
        Colonia coloniaBorrar = (Colonia) buscarPorID(colonias);
        if (coloniaBorrar != null) colonias.remove(coloniaBorrar);
    }

    public void modificarColonia() {
        Colonia coloniaEditar = (Colonia) buscarPorID(colonias);
        if (coloniaEditar != null) {
            System.out.println("Nuevo nombre: ");
            String nuevoNombre = ReadUtil.leerTexto();
            coloniaEditar.setNombre(nuevoNombre);

            System.out.println("codigo postal: ");
            Integer nuevoCp = ReadUtil.leerEntero();
            coloniaEditar.setCp(nuevoCp);
        }
    }


    public void verColonias() {
        if (colonias != null) colonias.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(colonias, "colonias");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(colonias, "colonias");
    }


    public void leerBaseDatos() {
        colonias = ColoniaJdbcImpl.getInstance().findAll();
    }

    public void guardarBaseDatos() {
        ColoniaJdbcImpl db = ColoniaJdbcImpl.getInstance();
        for (Colonia e : colonias) {
            db.guardar(e);
        }
    }

    @Override
    public String toString() {
        return "Colonia: " + nombre + " (ID: " + id + ")" + " (Municipio: " + municipio + ") ";
    }
}

