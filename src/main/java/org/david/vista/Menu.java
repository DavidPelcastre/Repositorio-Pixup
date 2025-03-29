package org.david.vista;

public class Menu {
    public static void MenuConsola() {
        System.out.println("HOLA");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- SALIR");
    }

    public static void MenuCatalogo(){
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Catalogo");
        System.out.println("2.- Pendiente");
        System.out.println("3.- Salir");
    }

    public static void MenuGestion() {
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Altas");
        System.out.println("2.- Bajas");
        System.out.println("3.- Ver");
        System.out.println("4.- Actualzar");
        System.out.println("5.- Salir");
    }

    public static void MenuUbicacion() {
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Estado");
        System.out.println("2.- Muincipio");
        System.out.println("3.- Colonia");
        System.out.println("4.- Salir");

    }

    public static void leerNombre( )
    {
        System.out.println( "Nombre del " );
    }

    public static void leerCP( )
    {
        System.out.println( "Nombre del " );
    }

    /*public static void imprimirEstado(Estado estado)
    {
//        System.out.println( "ID Estado: " + estado.( ) );
  //      System.out.println( "Nombre Estado: " + estado.( ) );
    }
    */
    public static void opcionInvalida( )
    {
        System.out.println("La opción no es correcta, intenta otra vez");
    }

    public static void errorDato( )
    {
        System.out.println("No es un dato valido, intenta otra vez");
    }
}
