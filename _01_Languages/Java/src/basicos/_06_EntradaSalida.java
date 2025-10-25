package _01_Languages.Java.src.basicos;

import java.util.Scanner;

/**
 * Ejemplo de entrada y salida de datos con Scanner.
 */

public class _06_EntradaSalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("\n¡Hola " + nombre + "! Tienes " + edad + " años.");

        sc.close();
    }
}
