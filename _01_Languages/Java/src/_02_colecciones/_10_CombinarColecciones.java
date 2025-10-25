package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Combina dos colecciones (ArrayList y HashMap) para mostrar usuarios y su edad.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class _10_CombinarColecciones {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("Ana");
        usuarios.add("Luis");
        usuarios.add("María");

        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("María", 28);

        for (String u : usuarios)
            System.out.println("👤 " + u + " tiene " + edades.get(u) + " años");
    }
}
