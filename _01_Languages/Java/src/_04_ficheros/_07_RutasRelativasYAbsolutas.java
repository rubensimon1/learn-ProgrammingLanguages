package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Muestra la diferencia entre rutas relativas y absolutas al crear archivos.
 */

import java.io.File;
import java.io.IOException;

public class _07_RutasRelativasYAbsolutas {
    public static void main(String[] args) {
        try {
            File relativo = new File("archivo_relativo.txt");
            relativo.createNewFile();

            File absoluto = new File("C:/Temp/archivo_absoluto.txt");
            absoluto.createNewFile();

            System.out.println("📁 Ruta relativa: " + relativo.getAbsolutePath());
            System.out.println("📁 Ruta absoluta: " + absoluto.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
