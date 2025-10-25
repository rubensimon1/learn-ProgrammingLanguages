package _01_Languages.Java.src._01_basicos;

/*
 * 🧩 Enunciado:
 * Pide al usuario su edad y muestra:
 * - "Menor de edad" si es < 18
 * - "Adulto" si está entre 18 y 65
 * - "Jubilado" si es >= 65
 */

import java.util.Scanner;

public class _04_Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("👶 Eres menor de edad.");
        } else if (edad < 65) {
            System.out.println("🧑 Eres adulto.");
        } else {
            System.out.println("👴 Eres jubilado.");
        }

        sc.close();
    }
}
