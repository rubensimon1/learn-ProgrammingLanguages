package _01_Languages.Java.src.colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class _06_ComparadoresYOrden {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(15);
        numeros.add(3);
        numeros.add(27);
        numeros.add(9);

        System.out.println("Original: " + numeros);

        Collections.sort(numeros);
        System.out.println("Orden ascendente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Orden descendente: " + numeros);
    }
}
