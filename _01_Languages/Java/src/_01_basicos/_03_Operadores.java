package _01_Languages.Java.src._01_basicos;

/*
 * 🧩 Enunciado:
 * Declara dos números enteros y muestra:
 * - su suma
 * - su resta
 * - su multiplicación
 * - su división
 * - su módulo
 */

public class _03_Operadores {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + ((double)a / b));
        System.out.println("Módulo: " + (a % b));
    }
}
