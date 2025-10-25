package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 4: Condicionales
Pide la edad de una persona y muestra si es menor de edad, adulto o adulto mayor.
*/

import java.util.Scanner;

public class _04_Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad <= 65) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
        sc.close();
    }
}
