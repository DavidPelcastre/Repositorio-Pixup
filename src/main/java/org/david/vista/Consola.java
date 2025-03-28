import org.david.vista.MenuConsola;

import java.util.Scanner;

public class Consola {
    private Scanner scanner;
    private MenuConsola menuConsola;

    public Consola() {
        scanner = new Scanner(System.in);
        menuConsola = new MenuConsola();
    }

    public void iniciar() {
        int opcion;
        do {
            menuConsola.mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Opción 1 seleccionada.");
                // Llamar a métodos de gestión aquí
                break;
            case 2:
                System.out.println("Opción 2 seleccionada.");
                // Otra funcionalidad
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
}
