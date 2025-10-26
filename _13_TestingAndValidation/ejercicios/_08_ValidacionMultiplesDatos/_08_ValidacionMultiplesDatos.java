package _13_TestingAndValidation.ejercicios._08_ValidacionMultiplesDatos;

import java.util.Scanner;

public class _08_ValidacionMultiplesDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String correo;

        do {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
        } while (nombre.trim().isEmpty());

        do {
            System.out.print("Edad: ");
            while (!sc.hasNextInt()) sc.next();
            edad = sc.nextInt();
        } while (edad <= 0);
        sc.nextLine(); // Limpiar buffer

        do {
            System.out.print("Correo: ");
            correo = sc.nextLine();
        } while (!correo.contains("@"));

        System.out.println("Datos válidos: " + nombre + ", " + edad + ", " + correo);
    }
}
