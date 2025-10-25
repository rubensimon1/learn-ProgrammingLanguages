package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Escribe varias líneas en un archivo con BufferedWriter y léelas con BufferedReader.
 */

import java.io.*;

public class _02_BufferedWriterReader {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));
            bw.write("Primera línea\n");
            bw.write("Segunda línea\n");
            bw.write("Tercera línea");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;
            System.out.println("📘 Contenido leído:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
