package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 11: Colecciones
Usar ArrayList para nombres y HashMap para edades.
*/

import java.util.ArrayList;
import java.util.HashMap;

public class _11_Colecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        System.out.println("Lista de nombres:");
        for (String n : nombres) System.out.println("- " + n);

        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("Carlos", 28);

        System.out.println("\nEdades:");
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años");
        }
    }
}

