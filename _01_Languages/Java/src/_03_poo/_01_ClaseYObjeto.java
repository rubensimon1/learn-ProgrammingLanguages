package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Persona con atributos nombre y edad.
 * Crea un objeto en main, asigna valores y muéstralos.
 *
 * Objetivo:
 * - Entender cómo se define una clase y se crea un objeto.
 */

class Persona {
    String nombre;
    int edad;
}

public class _01_ClaseYObjeto {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Ana";
        p1.edad = 25;

        System.out.println("👩 Nombre: " + p1.nombre);
        System.out.println("🎂 Edad: " + p1.edad);
    }
}
