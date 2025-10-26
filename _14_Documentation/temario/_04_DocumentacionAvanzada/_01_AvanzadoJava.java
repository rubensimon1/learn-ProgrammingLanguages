package _14_Documentation.temario._04_DocumentacionAvanzada;

/**
 * Clase ejemplo de documentación avanzada
 * @author ChatGPT
 * @version 1.0
 * @since 2025-10-26
 */

/**
 * Representa un usuario en un sistema
 */
public class _01_AvanzadoJava
{
    private String nombre;
    private int edad;

    /**
     * Constructor de Usuario
     * @param nombre Nombre del usuario
     * @param edad Edad del usuario
     */
    public _01_AvanzadoJava(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve una descripción del usuario
     * @return String con el nombre y edad
     */
    public String descripcion() {
        return nombre + " tiene " + edad + " años.";
    }
}

