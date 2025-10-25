package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Lista todos los archivos de un directorio usando la clase File.
 */

import java.io.File;

public class _08_ListaDeArchivos {
    public static void main(String[] args) {
        File carpeta = new File(".");
        File[] archivos = carpeta.listFiles();

        System.out.println("📂 Archivos en el directorio actual:");
        if (archivos != null) {
            for (File f : archivos) {
                System.out.println((f.isDirectory() ? "[DIR] " : "[FILE] ") + f.getName());
            }
        } else {
            System.out.println("No se pudieron listar los archivos.");
        }
    }
}
