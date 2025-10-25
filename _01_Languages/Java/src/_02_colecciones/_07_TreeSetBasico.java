package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Usa un TreeSet para almacenar nombres sin duplicados y ordenados.
 */

import java.util.TreeSet;

public class _07_TreeSetBasico {
    public static void main(String[] args) {
        TreeSet<String> nombres = new TreeSet<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Bea");
        nombres.add("Ana"); // duplicado, se ignora

        System.out.println("📜 Nombres ordenados: " + nombres);
    }
}
