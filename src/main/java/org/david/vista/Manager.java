package org.david.vista;

import org.david.model.registrarUsuario.Estado;
import org.david.model.registrarUsuario.Municipio;
import org.david.model.registrarUsuario.Colonia;
import org.david.util.ReadUtil;
import java.util.ArrayList;
import java.util.List;


public class Manager {
    /*
    private final List<Estado> estados = new ArrayList<>();

    public List<Estado> getEstados() {
        return estados;
    }

    public void agregarEstado() {
        System.out.print("Ingrese el nombre del estado: ");
        String nombre = ReadUtil.leerTexto();
        int id = estados.size() + 1;
        estados.add(new Estado(id, nombre));
        System.out.println("Estado agregado con éxito.");
    }

    public void eliminarEstado() {
        System.out.print("Ingrese el ID del estado a eliminar: ");
        int id = ReadUtil.leerEntero();  // Método para leer un entero.
        estados.removeIf(e -> e.getId() == id); // Elimina si el id coincide.
        System.out.println("Estado eliminado (si existía).");
    }

    public void actualizarEstado() {
        System.out.print("Ingrese el ID del estado a actualizar: ");
        int id = ReadUtil.leerEntero();  // Método para leer un entero.
        System.out.print("Ingrese el nuevo nombre: ");
        String nombre = ReadUtil.leerTexto();  // Lee el nuevo nombre como texto.
        for (Estado estado : estados) {
            if (estado.getId() == id) {
                estado.setNombre(nombre);  // Modifica el nombre del estado.
                System.out.println("Estado actualizado.");
                return;
            }
        }
        System.out.println("Estado no encontrado.");
    }

    public void verEstados() {
        System.out.println("\nLista de Estados:");
        for (Estado estado : estados) {
            System.out.println(estado);  // Imprime la información del estado. Se asume que toString está implementado en Estado.
        }
    }

    public void agregarMunicipio() {
        if (estados.isEmpty()) {
            System.out.println("Primero agregue un estado.");
            return;
        }

        verEstados();
        System.out.print("Seleccione el ID del estado al que pertenece el municipio: ");
        int idEstado = ReadUtil.leerEntero();

        Estado estado = buscarEstadoPorId(idEstado);
        if (estado == null) {
            System.out.println("Estado no encontrado.");
            return;
        }

        System.out.print("Ingrese el nombre del municipio: ");
        String nombreMunicipio = ReadUtil.leerTexto();
        int nuevoId = estado.getMunicipios().size() + 1;

        Municipio municipio = new Municipio(nuevoId, nombreMunicipio);
        estado.agregarMunicipio(municipio);
        System.out.println("Municipio agregado correctamente.");
    }

    public void agregarColonia() {
        if (estados.isEmpty()) {
            System.out.println("Primero agregue un estado y municipios.");
            return;
        }

        verEstados();
        System.out.print("Seleccione el ID del estado: ");
        int idEstado = ReadUtil.leerEntero();
        Estado estado = buscarEstadoPorId(idEstado);
        if (estado == null || estado.getMunicipios().isEmpty()) {
            System.out.println("Estado no válido o sin municipios.");
            return;
        }

        for (Municipio m : estado.getMunicipios()) {
            System.out.println(m);
        }
        System.out.print("Seleccione el ID del municipio: ");
        int idMunicipio = ReadUtil.leerEntero();
        Municipio municipio = estado.getMunicipios().stream()
                .filter(m -> m.getId() == idMunicipio)
                .findFirst()
                .orElse(null);

        if (municipio == null) {
            System.out.println("Municipio no encontrado.");
            return;
        }

        System.out.print("Ingrese el nombre de la colonia: ");
        String nombreColonia = ReadUtil.leerTexto();
        System.out.print("Ingrese el código postal: ");
        String cp = ReadUtil.leerTexto();

        int nuevoId = municipio.getColonias().size() + 1;
        Colonia colonia = new Colonia(nuevoId, nombreColonia, cp);
        municipio.agregarColonia(colonia);
        System.out.println("Colonia agregada correctamente.");
    }

    private Estado buscarEstadoPorId(int id) {
        for (Estado estado : estados) {
            if (estado.getId() == id) return estado;
        }
        return null;
    }

    public void verMunicipios() {
        for (Estado estado : estados) {
            System.out.println("Estado: " + estado.getNombre());
            for (Municipio m : estado.getMunicipios()) {
                System.out.println("  " + m);
            }
        }
    }

    public void verColonias() {
        for (Estado estado : estados) {
            System.out.println("Estado: " + estado.getNombre());
            for (Municipio municipio : estado.getMunicipios()) {
                System.out.println("  Municipio: " + municipio.getNombre());
                for (Colonia colonia : municipio.getColonias()) {
                    System.out.println("    " + colonia);
                }
            }
        }
    }

     */

}

