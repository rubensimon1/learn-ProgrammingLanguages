package _01_Languages.Java.src._01_basicos;

/*
 * 🧩 Enunciado:
 * Pide al usuario su nombre y su edad, y muestra un mensaje personalizado.
 */

import java.util.Scanner;

public class _06_EntradaSalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años. 👋");

        sc.close();
    }
}
