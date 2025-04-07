package org.david.util;

import java.util.Scanner;

public class ReadUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerTexto() {
        return scanner.nextLine();
    }
    public static int leerEntero() {
        String valor = null;
        Integer aux = null;

        while (true) {
            valor = leerTexto();
            if (valor != null && !valor.isEmpty()) {
                try {
                    aux = Integer.valueOf(valor);
                    if ( (aux != null) ) {
                        return aux;
                    }
                } catch (Exception e) {
                }
            }
            System.out.println("Datos ingresados inválidos");
        }
    }

    public static double leerDouble() {
        double numero;
        while (true) {
            String entrada = scanner.nextLine().trim();
            try {
                numero = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        }
        return numero;
    }


}
