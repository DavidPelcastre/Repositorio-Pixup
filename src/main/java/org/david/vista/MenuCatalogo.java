package org.david.vista;

public enum MenuCatalogo {
    CATALOGO( 1, Consola.getInstance() ),
    PENDIENTE( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null ),
    private Integer id;
    private Ejecutable ejecutable;

    MenuCatalogo(Integer id, Ejecutable ejecutable)
    {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId()
    {
        return id;
    }

    public static MenuConsola getMenuConsolaById( int opcion )
    {
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
