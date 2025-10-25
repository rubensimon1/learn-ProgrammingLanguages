package _01_Languages.Java.src.colecciones;

import java.util.HashMap;

public class _03_HashMapEjemplo {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Rubén", 25);
        edades.put("Laura", 28);
        edades.put("Carlos", 22);

        System.out.println("Edades: " + edades);
        System.out.println("Edad de Rubén: " + edades.get("Rubén"));

        edades.remove("Carlos");
        System.out.println("Después de eliminar a Carlos: " + edades);
    }
}
