package _11_ConcurrencyAndThreads.ejercicios.Soluciones._01_Basicos;

class HiloSimple extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola desde el hilo - paso " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class _01_HiloSimple {
    public static void main(String[] args) {
        HiloSimple hilo = new HiloSimple();
        hilo.start();
    }
}
