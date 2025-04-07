package org.david.vista;

import org.david.interfaces.Ejecutable;
import org.david.model.agregarDisco.*;
import org.david.model.registrarUsuario.Colonia;
import org.david.model.registrarUsuario.Estado;
import org.david.model.registrarUsuario.Municipio;
import org.david.util.ReadUtil;

import java.util.ArrayList;
import java.util.List;

public class ManejadorCatalogos implements Ejecutable {

    private static ManejadorCatalogos instancia = new ManejadorCatalogos();
    private final List<Estado> estados = new ArrayList<>();

    private ManejadorCatalogos() {}

    public static ManejadorCatalogos getInstance() {
        if(instancia == null){
            instancia = new ManejadorCatalogos();
        }
        return instancia;
    }

    @Override
    public void ejecutar() {
        boolean enUbicacion = true;

        while (enUbicacion) {
            Menu.mostrarMenuUbicacion();
            int opcion = ReadUtil.leerEntero();
            MenuCatalogos menuCatalogos = MenuCatalogos.getById(opcion);

            if (menuCatalogos == MenuCatalogos.SALIR) {
                enUbicacion = false;
                return;
            } else {
                boolean enGestion = true;

                while (enGestion) {
                    Menu.mostrarMenuGestion();
                    int opcion2 = ReadUtil.leerEntero();
                    MenuGestion gestion = MenuGestion.getById(opcion2);

                    if (gestion == MenuGestion.SALIR) {
                        enGestion = false;
                    } else {
                        switch (menuCatalogos) {
                            case ESTADO -> manejarEstados(gestion);
                            case MUNICIPIO -> manejarMunicipios(gestion);
                            case COLONIA -> manejarColonias(gestion);
                            case ARTISTA -> manejarArtistas(gestion);
                            case DISQUERA -> manejarDisqueras(gestion);
                            case GENERO_MUSICAL -> manejarGenerosMusicales(gestion);
                            case DISCO -> manejarDiscos(gestion);
                            case CANCION -> manejarCanciones(gestion);
                            default -> System.out.println("Opción no válida.");
                        }
                    }
                }
            }
        }
    }

    private void manejarEstados(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Estado.getInstance().agregarEstado();
            case BAJAS -> Estado.getInstance().eliminarEstado();
            case VER -> Estado.getInstance().verEstados();
            case ACTUALIZAR -> Estado.getInstance().modificarEstado();
            case LEER_ARCHIVO -> Estado.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Estado.getInstance().guardarArchivo();
            case LEER_BD -> Estado.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Estado.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para ESTADO.");
        }
    }

    private void manejarMunicipios(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Municipio.getInstance().agregarMunicipio();
            case BAJAS -> Municipio.getInstance().eliminarMunicipio();
            case VER -> Municipio.getInstance().verMunicipios();
            case ACTUALIZAR -> Municipio.getInstance().modificarMunicipio();
            case LEER_ARCHIVO -> Municipio.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Municipio.getInstance().guardarArchivo();
            case LEER_BD -> Municipio.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Municipio.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para MUNICIPIO.");
        }
    }

    private void manejarColonias(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Colonia.getInstance().agregarColonia();
            case BAJAS -> Colonia.getInstance().eliminarColonia();
            case VER -> Colonia.getInstance().verColonias();
            case ACTUALIZAR -> Colonia.getInstance().modificarColonia();
            case LEER_ARCHIVO -> Colonia.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Colonia.getInstance().guardarArchivo();
            case LEER_BD -> Colonia.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Colonia.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para COLONIA.");
        }
    }


    private void manejarArtistas(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Artista.getInstance().agregarArtista();
            case BAJAS -> Artista.getInstance().eliminarArtista();
            case VER -> Artista.getInstance().verArtistas();
            case ACTUALIZAR -> Artista.getInstance().modificarArtista();
            case LEER_ARCHIVO -> Artista.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Artista.getInstance().guardarArchivo();
            case LEER_BD -> Artista.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Artista.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para ARTISTA.");
        }
    }

    private void manejarCanciones(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Cancion.getInstance().agregarCancion();
            case BAJAS -> Cancion.getInstance().eliminarCancion();
            case VER -> Cancion.getInstance().verCanciones();
            case ACTUALIZAR -> Cancion.getInstance().modificarCancion();
            case LEER_ARCHIVO -> Cancion.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Cancion.getInstance().guardarArchivo();
            case LEER_BD -> Cancion.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Cancion.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para CANCION.");
        }
    }


    private void manejarDiscos(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Disco.getInstance().agregarDisco();
            case BAJAS -> Disco.getInstance().eliminarDisco();
            case VER -> Disco.getInstance().verDiscos();
            case ACTUALIZAR -> Disco.getInstance().modificarDisco();
            case LEER_ARCHIVO -> Disco.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Disco.getInstance().guardarArchivo();
            case LEER_BD -> Disco.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Disco.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para DISCO.");
        }
    }

    private void manejarDisqueras(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> Disquera.getInstance().agregarDisquera();
            case BAJAS -> Disquera.getInstance().eliminarDisquera();
            case VER -> Disquera.getInstance().verDisqueras();
            case ACTUALIZAR -> Disquera.getInstance().modificarDisquera();
            case LEER_ARCHIVO -> Disquera.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> Disquera.getInstance().guardarArchivo();
            case LEER_BD -> Disquera.getInstance().leerBaseDatos();
            case GUARDAR_BD -> Disquera.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para DISQUERA.");
        }
    }

    private void manejarGenerosMusicales(MenuGestion gestion) {
        switch (gestion) {
            case ALTAS -> GeneroMusical.getInstance().agregarGenero();
            case BAJAS -> GeneroMusical.getInstance().eliminarGenero();
            case VER -> GeneroMusical.getInstance().verGeneros();
            case ACTUALIZAR -> GeneroMusical.getInstance().modificarGenero();
            case LEER_ARCHIVO -> GeneroMusical.getInstance().leerArchivo();
            case GUARDAR_ARCHIVO -> GeneroMusical.getInstance().guardarArchivo();
            case LEER_BD -> GeneroMusical.getInstance().leerBaseDatos();
            case GUARDAR_BD -> GeneroMusical.getInstance().guardarBaseDatos();
            default -> System.out.println("Opción no implementada para GÉNERO MUSICAL.");
        }
    }

}
