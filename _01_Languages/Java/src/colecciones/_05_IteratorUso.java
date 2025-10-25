package _01_Languages.Java.src.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class _05_IteratorUso {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");

        Iterator<String> it = frutas.iterator();

        System.out.println("Recorriendo lista con Iterator:");
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}
