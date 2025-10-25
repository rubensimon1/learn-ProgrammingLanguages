package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Crea una clase Alumno y guarda objetos en un ArrayList.
 * Muestra los alumnos con nota >= 5.
 */

import java.util.ArrayList;

class Alumno {
    String nombre;
    double nota;

    Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return nombre + " (" + nota + ")";
    }
}

public class _03_ArrayListObjetos {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();

        lista.add(new Alumno("Carlos", 8.0));
        lista.add(new Alumno("Laura", 4.5));
        lista.add(new Alumno("Marta", 6.3));

        System.out.println("✅ Aprobados:");
        for (Alumno a : lista)
            if (a.nota >= 5)
                System.out.println(a);
    }
}
