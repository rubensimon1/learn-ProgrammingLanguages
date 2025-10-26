package _13_TestingAndValidation.ejercicios._09_SimulacionFlujoCompleto;

import java.util.Scanner;

public class _09_SimulacionFlujoCompleto {
    public static int leerNumero(Scanner sc) {
        int n;
        do {
            System.out.print("Introduce un número positivo: ");
            while (!sc.hasNextInt()) sc.next();
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += leerNumero(sc);
        }

        System.out.println("Suma total: " + suma);
    }
}
