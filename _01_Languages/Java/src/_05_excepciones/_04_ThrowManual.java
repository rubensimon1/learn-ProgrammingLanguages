package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Lanza una excepción manual si el número introducido es negativo.
 */

import java.util.Scanner;

public class _04_ThrowManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número positivo: ");
            int n = sc.nextInt();

            if (n < 0)
                throw new IllegalArgumentException("El número no puede ser negativo.");

            System.out.println("✅ Número correcto: " + n);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
