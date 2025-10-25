package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Lee un archivo y cuenta cuántas líneas y palabras tiene.
 */

import java.io.*;

public class _04_ContarLineasYPalabras {
    public static void main(String[] args) {
        int lineas = 0, palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas++;
                palabras += linea.split("\\s+").length;
            }
            System.out.println("📄 Líneas: " + lineas);
            System.out.println("🔤 Palabras: " + palabras);

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
