package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea un array de objetos Estudiante con nombre y nota.
 * Muestra los estudiantes aprobados.
 */

class Estudiante {
    String nombre;
    double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    boolean aprobado() {
        return nota >= 5;
    }
}

public class _11_ArraysDeObjetos {
    public static void main(String[] args) {
        Estudiante[] alumnos = {
            new Estudiante("Ana", 8.5),
            new Estudiante("Luis", 4.3),
            new Estudiante("Marta", 6.0)
        };

        for (Estudiante e : alumnos) {
            System.out.println(e.nombre + (e.aprobado() ? " ✅ Aprobado" : " ❌ Suspendido"));
        }
    }
}

