package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Recorre un ArrayList con for, for-each e Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class _02_ArrayListRecorrer {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 5; i++) numeros.add(i);

        System.out.println("🔹 For clásico:");
        for (int i = 0; i < numeros.size(); i++)
            System.out.println(numeros.get(i));

        System.out.println("🔹 For-each:");
        for (int n : numeros)
            System.out.println(n);

        System.out.println("🔹 Iterator:");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
