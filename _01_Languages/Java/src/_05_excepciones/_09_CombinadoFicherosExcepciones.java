package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Combina ficheros y excepciones:
 * - Lee un archivo llamado "datos.txt".
 * - Si no existe, crea uno con contenido por defecto.
 * - Usa try-catch-finally para manejar los errores.
 */

import java.io.*;

public class _09_CombinadoFicherosExcepciones {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");
        BufferedReader br = null;

        try {
            if (!archivo.exists()) {
                System.out.println("📄 Archivo no encontrado. Creando uno nuevo...");
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Ejemplo de texto\nSegunda línea");
                bw.close();
            }

            br = new BufferedReader(new FileReader(archivo));
            String linea;
            System.out.println("📖 Contenido del archivo:");
            while ((linea = br.readLine()) != null)
                System.out.println(linea);

        } catch (IOException e) {
            System.out.println("❌ Error de lectura/escritura: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("⚠️ Error al cerrar el archivo.");
            }
            System.out.println("🔚 Proceso terminado.");
        }
    }
}
