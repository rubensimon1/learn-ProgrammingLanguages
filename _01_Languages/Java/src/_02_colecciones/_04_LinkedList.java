package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Usa LinkedList para simular una cola de atención al cliente.
 * Atiende (quita) clientes uno por uno.
 */

import java.util.LinkedList;

public class _04_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cola = new LinkedList<>();

        cola.add("Cliente1");
        cola.add("Cliente2");
        cola.add("Cliente3");

        System.out.println("🧾 Cola inicial: " + cola);

        while (!cola.isEmpty()) {
            String atendido = cola.removeFirst();
            System.out.println("👤 Atendiendo a: " + atendido);
            System.out.println("Cola restante: " + cola);
        }
    }
}

