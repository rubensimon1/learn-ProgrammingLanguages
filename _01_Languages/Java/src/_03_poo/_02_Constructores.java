package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Añade un constructor a la clase Persona que inicialice nombre y edad.
 * Crea dos objetos con distintos valores.
 *
 * Objetivo:
 * - Aprender a usar constructores.
 */

class Persona2 {
    String nombre;
    int edad;

    Persona2(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }
}

public class _02_Constructores {
    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Carlos", 30);
        Persona2 p2 = new Persona2("Lucía", 22);

        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
