package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Crea un archivo llamado "datos.txt" y escribe dentro una frase.
 * Luego, léelo e imprime su contenido en consola.
 * 
 * Objetivo:
 * - Practicar FileWriter y FileReader.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _01_CrearYLeerArchivo {
    public static void main(String[] args) {
        try {
            // Escribir en archivo
            FileWriter fw = new FileWriter("datos.txt");
            fw.write("Aprendiendo Java paso a paso.\n");
            fw.close();

            // Leer el contenido
            FileReader fr = new FileReader("datos.txt");
            int c;
            System.out.println("📖 Contenido del archivo:");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("❌ Error al manejar el archivo: " + e.getMessage());
        }
    }
}
