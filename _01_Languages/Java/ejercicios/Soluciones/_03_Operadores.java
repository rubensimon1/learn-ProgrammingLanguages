package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 3: Operadores
Pide dos números y muestra operaciones aritméticas, comparaciones y lógicas.
*/

import java.util.Scanner;

public class _03_Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        System.out.println("¿a es mayor que b?: " + (a > b));
        System.out.println("¿a es igual que b?: " + (a == b));
        System.out.println("¿a es distinto de b?: " + (a != b));

        boolean comparacion = (a > 0) && (b > 0);
        System.out.println("¿Ambos son positivos?: " + comparacion);

        sc.close();
    }
}
