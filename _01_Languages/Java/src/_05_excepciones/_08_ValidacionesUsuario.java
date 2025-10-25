package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Crea un programa que pida nombre y edad.
 * Si el nombre está vacío o la edad es negativa, lanza una excepción.
 */

import java.util.Scanner;

public class _08_ValidacionesUsuario {

    public static void validarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (edad < 0)
            throw new IllegalArgumentException("La edad no puede ser negativa.");

        System.out.println("✅ Usuario válido: " + nombre + " (" + edad + " años)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();

            validarUsuario(nombre, edad);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        sc.close();
    }
}
