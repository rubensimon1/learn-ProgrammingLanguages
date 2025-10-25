package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 12: Excepciones
Pide dos números y maneja división por cero con try-catch.
*/

import java.util.Scanner;

public class _12_DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el numerador: ");
            int a = sc.nextInt();
            System.out.print("Introduce el denominador: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } finally {
            sc.close();
        }
    }
}

