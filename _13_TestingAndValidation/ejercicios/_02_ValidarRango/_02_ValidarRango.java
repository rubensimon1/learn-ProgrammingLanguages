package _13_TestingAndValidation.ejercicios._02_ValidarRango;

import java.util.Scanner;

public class _02_ValidarRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número entre 1 y 100: ");
            while (!sc.hasNextInt()) {
                System.out.print("No es un número. Intenta de nuevo: ");
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero < 1 || numero > 100);
        System.out.println("Número válido: " + numero);
        sc.close();
    }
}
