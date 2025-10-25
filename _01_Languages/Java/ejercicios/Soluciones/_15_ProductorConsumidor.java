package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 15: Hilos y Concurrencia
Simula productores y consumidores que comparten una pila.
*/

import java.util.Stack;

class PilaCompartida {
    private Stack<Integer> pila = new Stack<>();
    private final int CAPACIDAD = 5;

    public synchronized void producir(int valor) throws InterruptedException {
        while (pila.size() == CAPACIDAD) wait();
        pila.push(valor);
        System.out.println("Producido: " + valor);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (pila.isEmpty()) wait();
        int valor = pila.pop();
        System.out.println("Consumido: " + valor);
        notifyAll();
        return valor;
    }
}

class Productor extends Thread {
    private PilaCompartida pila;
    public Productor(PilaCompartida pila) { this.pila = pila; }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                pila.producir(i);
                Thread.sleep(200);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class Consumidor extends Thread {
    private PilaCompartida pila;
    public Consumidor(PilaCompartida pila) { this.pila = pila; }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                pila.consumir();
                Thread.sleep(300);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class _15_ProductorConsumidor {
    public static void main(String[] args) {
        PilaCompartida pila = new PilaCompartida();
        new Productor(pila).start();
        new Consumidor(pila).start();
    }
}
