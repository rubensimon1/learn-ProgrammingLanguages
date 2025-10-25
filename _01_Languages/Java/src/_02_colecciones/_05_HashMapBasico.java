package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Usa un HashMap para guardar nombres y edades.
 * Recorre las claves y muestra su contenido.
 */

import java.util.HashMap;
import java.util.Map;

public class _05_HashMapBasico {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("María", 28);

        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println("👤 " + entry.getKey() + " tiene " + entry.getValue() + " años");
        }
    }
}
