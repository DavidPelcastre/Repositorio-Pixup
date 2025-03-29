package org.david.util;

import java.util.Scanner;

public class ReadUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
