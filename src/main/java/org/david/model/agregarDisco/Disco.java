package org.david.model.agregarDisco;

import org.david.model.Catalogo;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class Disco extends Catalogo {
    protected static List<Disco> discos = new ArrayList<>();
    private static Disco instanciaDisco;

    double precio;
    int existencia;
    double descuento;
    String fechaLanzamiento;
    String imagen;
    Disquera disquera;
    Artista artista;
    GeneroMusical generoMusical;

    private static Integer idCambio = 0;

    private Disco() { }

    public static Disco getInstance() {
        if (instanciaDisco == null) {
            instanciaDisco = new Disco();
        }
        return instanciaDisco;
    }

    public Disco(String nombre, double precio, int existencia, double descuento,
                 String fechaLanzamiento, String imagen,
                 Disquera disquera, Artista artista, GeneroMusical generoMusical) {
        super(++idCambio, nombre);
        this.precio = precio;
        this.existencia = existencia;
        this.descuento = descuento;
        this.fechaLanzamiento = fechaLanzamiento;
        this.imagen = imagen;
        this.disquera = disquera;
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void agregarDisco() {
        System.out.println("--Agregar disco--");

        System.out.println("Nombre disco: ");
        String nombreNuevo = ReadUtil.leerTexto();

        System.out.println("Precio: ");
        double precio = ReadUtil.leerDouble();

        System.out.println("Existencia: ");
        int existencia = ReadUtil.leerEntero();

        System.out.println("Descuento (%): ");
        double descuento = ReadUtil.leerDouble();

        System.out.println("Fecha de lanzamiento (ej. 2025-04-05): ");
        String fechaLanzamiento = ReadUtil.leerTexto();

        System.out.println("URL o ruta de imagen: ");
        String imagen = ReadUtil.leerTexto();

        System.out.println("Selecciona una disquera:");
        Disquera disquera = (Disquera) buscarPorID(Disquera.disqueras);

        System.out.println("Selecciona un artista:");
        Artista artista = (Artista) buscarPorID(Artista.artistas);

        System.out.println("Selecciona un género musical:");
        GeneroMusical generoMusical = (GeneroMusical) buscarPorID(GeneroMusical.generos);

        if (disquera != null && artista != null && generoMusical != null) {
            discos.add(new Disco(nombreNuevo, precio, existencia, descuento, fechaLanzamiento,
                    imagen, disquera, artista, generoMusical));
        } else {
            System.out.println("Error: Uno o más elementos requeridos no fueron seleccionados correctamente.");
        }
    }

    public void eliminarDisco() {
        Disco discoBorrar = (Disco) buscarPorID(discos);
        if (discoBorrar != null) discos.remove(discoBorrar);
    }

    public void modificarDisco() {
        Disco discoEditar = (Disco) buscarPorID(discos);
        if (discoEditar != null){
            System.out.println("Nuevo nombre: ");
            String nuevoNombre = ReadUtil.leerTexto();
            discoEditar.setNombre(nuevoNombre);

            System.out.println("Nuevo precio: ");
            double precio = ReadUtil.leerDouble();
            discoEditar.setPrecio(precio);

            System.out.println("Nueva existencia: ");
            int existencia = ReadUtil.leerEntero();
            discoEditar.setExistencia(existencia);

            System.out.println("Nuevo descuento: ");
            double descuento = ReadUtil.leerDouble();
            discoEditar.setDescuento(descuento);

            System.out.println("Nueva fecha lanzamiento: ");
            String fechaLanzamiento = ReadUtil.leerTexto();
            discoEditar.setFechaLanzamiento(fechaLanzamiento);
            
            System.out.println("Nueva imagen: ");
            String imagen = ReadUtil.leerTexto();
            discoEditar.setImagen(imagen);
        }
    }

    public void verDiscos() {
        if (discos != null) discos.forEach(System.out::println);
    }

    public void leerArchivo(){
        realizarLeerArchivo(discos, "discos");
    }
    public void guardarArchivo(){
        realizarGuardarArchivo(discos, "discos");
    }

/*
    @Override
    public String toString() {
        return "Disco: " + nombre + " (ID: " + id + ")";
    }

 */

    @Override
    public String toString() {
        return  "Disco: '" + nombre + '\'' +
                ", id=" + id +
                ", precio=" + precio +
                ", existencia=" + existencia +
                ", descuento=" + descuento +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", imagen='" + imagen + '\'' +
                ", disquera=" + disquera +
                ", artista=" + artista +
                ", generoMusical=" + generoMusical +
                '}';
    }
}
