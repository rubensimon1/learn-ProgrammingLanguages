package _13_TestingAndValidation.ejercicios._01_ValidarNumeroPositivo;

import java.util.Scanner;

public class _01_ValidarNumeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número positivo: ");
            while (!sc.hasNextInt()) {
                System.out.print("No es un número. Intenta de nuevo: ");
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println("Número válido: " + numero);
        sc.close();
    }
}
