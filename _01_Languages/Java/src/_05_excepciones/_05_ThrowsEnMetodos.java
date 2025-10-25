package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Crea un método que lea un número desde la consola y lance una excepción si no es válido.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_ThrowsEnMetodos {

    public static int leerNumero() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        try {
            int numero = leerNumero();
            System.out.println("Has introducido: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("❌ Error: No introdujiste un número válido.");
        }
    }
}
