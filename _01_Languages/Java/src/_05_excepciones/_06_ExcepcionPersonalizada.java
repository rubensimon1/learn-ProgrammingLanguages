package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Crea una excepción personalizada llamada EdadInvalidaException.
 * Lanza la excepción si la edad es menor que 0 o mayor que 120.
 */

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class _06_ExcepcionPersonalizada {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120)
            throw new EdadInvalidaException("Edad fuera de rango permitido.");
        System.out.println("✅ Edad válida: " + edad);
    }

    public static void main(String[] args) {
        try {
            validarEdad(150);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
