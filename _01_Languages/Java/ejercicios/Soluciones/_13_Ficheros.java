package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 13: Ficheros
Escribe nombres en un archivo y luego léelos.
*/

import java.io.*;

public class _13_Ficheros {
    public static void main(String[] args) {
        String ruta = "nombres.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write("Ana\nLuis\nCarlos\nMarta\n");
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}


