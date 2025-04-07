package org.david.model;

import org.david.util.ReadUtil;

import java.io.*;
import java.util.List;

public abstract class Catalogo implements Serializable {
    protected Integer id;
    protected String nombre;

    public Catalogo() {
    }
    public Catalogo(Integer id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public <T extends Catalogo>  Catalogo buscarPorID(List<T> list){
        System.out.println("Cuál es el id: ");
        int id = ReadUtil.leerEntero();
        for (Catalogo c : list) {
            if(c.getId() == id) {
                return c;
            }
        }
        System.out.println("Elemento no encontrado");
        return null;
    }

    public <T extends Catalogo>  Catalogo buscarPorID(List<T> list, int idCatalogo){
        for (Catalogo c : list) {
            if(c.getId() == id) {
                return c;
            }
        }
        System.out.println("Elemento no encontrado");
        return null;
    }

    public File getFile(String nombre){
        return new File ("./" + nombre + ".dat");
    }

    public <T extends Catalogo> void realizarLeerArchivo(List<T> list, String nombre) {
        File file = getFile(nombre);
        if (!file.exists()) {
            System.out.println("El archivo no se encontró.");
            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            List<T> deserializedList = (List<T>) objectInputStream.readObject();
            list.clear();
            list.addAll(deserializedList);
            System.out.println("Archivo leído con éxito.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hubo un error al leer el archivo.");
            e.printStackTrace(); // opcional para depuración
        }
    }



    public void realizarGuardarArchivo(List<? extends Catalogo> list, String nombre) {
        if (list.isEmpty()) {
            System.out.println("No hay elementos para guardar");
            return;
        }

        File file = getFile(nombre);
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(list);
            System.out.println("Archivo guardado con éxito.");

        } catch (IOException e) {
            System.out.println("Hubo un error al guardar el archivo.");
            e.printStackTrace();
        }
    }

    public <T extends Catalogo> void realizarGuardarBD(List<T> list){

    }




    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
