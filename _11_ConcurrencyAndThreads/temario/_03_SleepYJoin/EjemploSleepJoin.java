package _11_ConcurrencyAndThreads.temario._03_SleepYJoin;

class HiloConPausa extends Thread {
    private String nombre;

    public HiloConPausa(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(nombre + " - paso " + i);
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nombre + " interrumpido.");
            }
        }
        System.out.println(nombre + " ha terminado.");
    }
}

public class EjemploSleepJoin {
    public static void main(String[] args) throws InterruptedException {
        HiloConPausa hilo1 = new HiloConPausa("Hilo 1");
        HiloConPausa hilo2 = new HiloConPausa("Hilo 2");

        hilo1.start();
        hilo2.start();

        hilo1.join(); // Espera a que termine hilo1
        hilo2.join(); // Espera a que termine hilo2

        System.out.println("Todos los hilos han terminado.");
    }
}
