package a_Languages.Java.src.colecciones;

import java.util.TreeSet;

public class _04_TreeSetOrdenado {
    public static void main(String[] args) {
        TreeSet<String> paises = new TreeSet<>();
        paises.add("España");
        paises.add("México");
        paises.add("Argentina");
        paises.add("Perú");

        System.out.println("Paises ordenados: " + paises);
        System.out.println("Primer país: " + paises.first());
        System.out.println("Último país: " + paises.last());
    }
}
