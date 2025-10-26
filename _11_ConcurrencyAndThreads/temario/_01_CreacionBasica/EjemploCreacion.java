package _11_ConcurrencyAndThreads.temario._01_CreacionBasica;

class MiHilo extends Thread {
    public void run() {
        System.out.println("Hola desde el hilo: " + Thread.currentThread().getName());
    }
}

public class EjemploCreacion {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();
        System.out.println("Hilo principal finalizado");
    }
}
