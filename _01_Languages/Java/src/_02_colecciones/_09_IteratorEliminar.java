package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Usa un Iterator para eliminar elementos de un ArrayList mientras se recorre.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class _09_IteratorEliminar {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) numeros.add(i);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) it.remove();
        }

        System.out.println("🔥 Números impares restantes: " + numeros);
    }
}
