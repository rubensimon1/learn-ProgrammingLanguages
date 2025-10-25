package _01_Languages.Java.src._02_colecciones;
/*
 * 🧩 Enunciado:
 * Crea un ArrayList de Strings con nombres.
 * Añade, muestra y elimina elementos.
 */

import java.util.ArrayList;

public class _01_ArrayListBasico {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");

        System.out.println("📋 Lista completa: " + nombres);

        nombres.remove("Luis");

        System.out.println("❌ Después de eliminar a Luis: " + nombres);
    }
}

