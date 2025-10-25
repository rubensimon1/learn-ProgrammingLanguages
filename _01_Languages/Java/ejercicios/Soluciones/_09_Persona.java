package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 9: Clase Persona
Crea una clase con atributos privados, constructor y métodos get y mostrarDatos.
*/

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

public class _09_Persona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Luis", 30);

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}

