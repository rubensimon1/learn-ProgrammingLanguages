package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 14: Ejercicio Integrador
Combina POO, ficheros, excepciones y colecciones.
Permite crear personas, guardarlas en un archivo y listarlas.
*/

import java.io.*;
import java.util.*;

class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad) { this.nombre = nombre; this.edad = edad; }
    @Override
    public String toString() { return nombre + "," + edad; }
}

public class _14_SistemaIntegrado {
    static final String ARCHIVO = "personas.txt";

    public static void guardarPersona(Persona p) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            bw.write(p.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public static void mostrarPersonas() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Persona p = new Persona(nombre, edad);
        guardarPersona(p);

        System.out.println("\nPersonas registradas:");
        mostrarPersonas();
        sc.close();
    }
}
