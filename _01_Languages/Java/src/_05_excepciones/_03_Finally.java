package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Demuestra el uso del bloque finally.
 * Intenta abrir un archivo y muestra un mensaje aunque haya error.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03_Finally {
    public static void main(String[] args) {
        Scanner lector = null;

        try {
            File archivo = new File("archivo_inexistente.txt");
            lector = new Scanner(archivo);
            System.out.println("Leyendo archivo...");
        } catch (FileNotFoundException e) {
            System.out.println("❌ Archivo no encontrado.");
        } finally {
            if (lector != null) lector.close();
            System.out.println("🔒 Bloque finally ejecutado siempre.");
        }
    }
}
