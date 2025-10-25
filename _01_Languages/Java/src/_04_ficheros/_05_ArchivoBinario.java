package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Crea un archivo binario y escribe algunos bytes.
 * Luego, léelos e imprímelos en consola.
 */

import java.io.*;

public class _05_ArchivoBinario {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("datos.bin");
            fos.write(new byte[]{10, 20, 30, 40});
            fos.close();

            FileInputStream fis = new FileInputStream("datos.bin");
            int dato;
            System.out.println("📦 Bytes leídos:");
            while ((dato = fis.read()) != -1) {
                System.out.print(dato + " ");
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("❌ Error de archivo: " + e.getMessage());
        }
    }
}
