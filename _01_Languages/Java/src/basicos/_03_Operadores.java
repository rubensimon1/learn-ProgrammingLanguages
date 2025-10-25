package _01_Languages.Java.src.basicos;

/**
 * Ejemplo de operadores aritméticos, relacionales y lógicos en Java.
 */

public class _03_Operadores {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Aritméticos
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

        // Relacionales
        System.out.println("¿a > b? " + (a > b));
        System.out.println("¿a == b? " + (a == b));

        // Lógicos
        boolean esMayor = (a > b);
        boolean esPositivo = (a > 0);
        System.out.println("¿a es mayor y positivo? " + (esMayor && esPositivo));
    }
}
