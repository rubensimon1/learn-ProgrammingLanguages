package _11_ConcurrencyAndThreads.temario._02_MultiHilos;

class Tarea extends Thread {
    private int id;

    public Tarea(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Ejecutando hilo número: " + id);
    }
}

public class EjemploMultiHilos {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Tarea t = new Tarea(i);
            t.start();
        }

        System.out.println("Hilos iniciados.");
    }
}
