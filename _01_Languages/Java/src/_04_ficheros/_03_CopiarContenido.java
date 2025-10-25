package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Crea un programa que copie el contenido de un archivo a otro.
 * Ejemplo: de "origen.txt" a "destino.txt"
 */

import java.io.*;

public class _03_CopiarContenido {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("origen.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("destino.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("✅ Archivo copiado correctamente.");

        } catch (IOException e) {
            System.out.println("❌ Error al copiar: " + e.getMessage());
        }
    }
}
