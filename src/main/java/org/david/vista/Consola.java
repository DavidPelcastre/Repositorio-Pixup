package org.david.vista;

import org.david.util.ReadUtil;
import org.david.vista.MenuConsola;

import java.util.Scanner;

public class Consola implements Ejecutable {
    private static Consola consola;
    private Consola()
    {
    }

    public static Consola getInstance( ) {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    //    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        MenuConsola menuConsola = null;
        MenuCatalogo menuCatalogo = null;
        MenuGestion menuGestion = null;
        MenuUbicacion menuUbicacion = null;
        /*while( flag )
        {
            Menu.MenuConsola( );
            Menu.leerNombre( );
            opcion = ReadUtil.readInt();

            menuConsola = MenuConsola.getMenuConsolaById( opcion );
            trianguloEnum = TrianguloEnum.getTrianguloEnumById( opcion );


            if( FiguraEnum.SALIR.equals( figuraEnum ) )
            {
                flag = false;
            }
            if( FiguraEnum.OPCION_ERRONEA.equals( figuraEnum ) )
            {
                Menu.opcionInvalida( );
            }

            figura = FiguraFactory.getFiguraByFiguraEnum( figuraEnum );
            if( figura != null )
            {
                ((SolicitaDatos)figura).leeDatos( );
                Menu.calcula( figura );
            }

            figura = FiguraFactory.getFiguraByTrianguloEnum( trianguloEnum );
            if( figura != null )
            {
                ((SolicitaDatos)figura).leeDatos( );
                Menu.calcula( figura );
            }
        }*/
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Consola...");
    }
}
