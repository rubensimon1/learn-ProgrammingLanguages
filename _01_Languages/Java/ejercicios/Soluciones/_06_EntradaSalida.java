package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 6: Entrada y Salida
Pide al usuario su nombre y edad, y muestra un mensaje personalizado.
*/

import java.util.Scanner;

public class _06_EntradaSalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        sc.close();
    }
}

