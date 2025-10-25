package _01_Languages.Java.src.basicos;

/**
 * Ejemplo de tipos de datos básicos en Java.
 * Muestra cómo declarar variables, constantes y sus valores.
 */

public class _02_TiposDeDatos {
    public static void main(String[] args) {
        // Tipos primitivos
        int edad = 25;
        double altura = 1.82;
        char inicial = 'R';
        boolean activo = true;

        // Constante
        final String NOMBRE = "Rubén";

        System.out.println("Nombre: " + NOMBRE);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Activo?: " + activo);
    }
}
