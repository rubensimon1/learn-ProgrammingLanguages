package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 5: Bucles
1. Mostrar los números pares del 1 al 100.
2. Pedir 5 números y mostrar su suma total.
*/

import java.util.Scanner;

public class _05_Bucles {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("\nIngrese un número: ");
            suma += sc.nextInt();
            contador++;
        } while (contador < 5);

        System.out.println("La suma total es: " + suma);
        sc.close();
    }
}
