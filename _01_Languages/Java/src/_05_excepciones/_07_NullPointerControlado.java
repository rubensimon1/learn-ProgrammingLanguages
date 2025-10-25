package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Controla un NullPointerException al intentar acceder a un objeto nulo.
 */

public class _07_NullPointerControlado {
    public static void main(String[] args) {
        String texto = null;

        try {
            System.out.println("Longitud del texto: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("❌ Error: el texto es nulo.");
        }
    }
}

