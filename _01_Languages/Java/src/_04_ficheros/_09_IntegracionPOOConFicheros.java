package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Crea una clase Producto con nombre y precio.
 * Guarda varios productos en un archivo de texto y luego léelos.
 */

import java.io.*;
import java.util.*;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return nombre + " - " + precio + "€";
    }
}

public class _09_IntegracionPOOConFicheros {
    public static void main(String[] args) {
        List<Producto> lista = Arrays.asList(
            new Producto("Teclado", 25.99),
            new Producto("Ratón", 15.49),
            new Producto("Monitor", 179.99)
        );

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt"))) {
            for (Producto p : lista) {
                bw.write(p.nombre + "," + p.precio);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("❌ Error al escribir: " + e.getMessage());
        }

        System.out.println("📦 Productos guardados correctamente.");

        try (BufferedReader br = new BufferedReader(new FileReader("productos.txt"))) {
            String linea;
            System.out.println("\n📖 Productos leídos:");
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println(datos[0] + " - " + datos[1] + "€");
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer: " + e.getMessage());
        }
    }
}
