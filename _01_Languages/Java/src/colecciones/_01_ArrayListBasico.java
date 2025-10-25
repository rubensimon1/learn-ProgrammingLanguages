package _01_Languages.Java.src.colecciones;

import java.util.ArrayList;

public class _01_ArrayListBasico {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Rubén");
        nombres.add("Laura");
        nombres.add("Carlos");

        System.out.println("Lista completa: " + nombres);
        System.out.println("Primer elemento: " + nombres.get(0));

        nombres.remove("Laura");
        System.out.println("Después de eliminar: " + nombres);
    }
}
