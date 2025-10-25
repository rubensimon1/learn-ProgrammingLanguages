package a_Languages.Java.src.basicos;

/**
 * Ejemplo de bucles for, while y do-while en Java.
 */

public class _05_Bucles {
    public static void main(String[] args) {
        // Bucle for
        System.out.println("Bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucle while
        System.out.println("\nBucle while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Bucle do-while
        System.out.println("\nBucle do-while:");
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }
}
