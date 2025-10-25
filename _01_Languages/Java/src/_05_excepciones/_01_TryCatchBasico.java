package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Pide al usuario un número entero. 
 * Si introduce un valor no numérico, captura la excepción y muestra un mensaje de error.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_TryCatchBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero: ");
            int numero = sc.nextInt();
            System.out.println("✅ Has introducido el número: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes introducir un número entero.");
        }

        sc.close();
    }
}
