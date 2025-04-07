package org.david.vista;

import org.david.util.ReadUtil;

public class Menu {

    public static int mostrarMenuPrincipal() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Consola");
        System.out.println("2. Ventana (Pendiente)");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return ReadUtil.leerEntero();
    }

    public static void mostrarMenuCatalogo() {
        System.out.println("\n--- MENÚ CATÁLOGO ---");
        System.out.println("1. Gestión");
        System.out.println("2. Pendiente (Aún no implementado)");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarMenuGestion() {
        System.out.println("\n--- MENÚ GESTIÓN ---");
        System.out.println("1. Altas");
        System.out.println("2. Bajas");
        System.out.println("3. Ver");
        System.out.println("4. Actualizar");
        System.out.println("5. Leer Archivo");
        System.out.println("6. Guardar Archivo");
        System.out.println("7. Leer Base de Datos");
        System.out.println("8. Guardar Base de Datos");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarMenuUbicacion() {
        System.out.println("\n--- MENÚ UBICACIÓN ---");
        System.out.println("1. Estado");
        System.out.println("2. Municipio");
        System.out.println("3. Colonia");
        System.out.println("4. Artista");
        System.out.println("5. Disquera");
        System.out.println("6. Género Musical");
        System.out.println("7. Disco");
        System.out.println("8. Canción");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

}
