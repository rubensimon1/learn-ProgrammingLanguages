package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Crea un TreeSet con objetos Persona y ordénalos por edad.
 */

import java.util.TreeSet;
import java.util.Comparator;

class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

public class _08_TreeSetComparador {
    public static void main(String[] args) {
        TreeSet<Persona> personas = new TreeSet<>(Comparator.comparingInt(p -> p.edad));

        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Luis", 25));
        personas.add(new Persona("Marta", 35));

        System.out.println("📈 Personas ordenadas por edad:");
        for (Persona p : personas)
            System.out.println(p);
    }
}
