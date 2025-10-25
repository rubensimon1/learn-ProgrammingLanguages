package _01_Languages.Java.src.colecciones;

import java.util.LinkedList;

public class _02_LinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.addFirst(5);
        numeros.addLast(30);

        System.out.println("Elementos en la lista: " + numeros);

        numeros.removeFirst();
        System.out.println("Después de eliminar el primero: " + numeros);
    }
}
