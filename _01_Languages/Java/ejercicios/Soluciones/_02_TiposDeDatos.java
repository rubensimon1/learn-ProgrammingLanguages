package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 2: Tipos de Datos y Variables
Declara variables de distintos tipos (int, double, char, boolean, String)
y muestra sus valores por pantalla.
*/

public class _02_TiposDeDatos {
    public static void main(String[] args) {
        int edad = 25;
        double altura = 1.75;
        char inicial = 'A';
        boolean estudiante = true;
        String nombre = "Lucía";

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + estudiante);
    }
}
