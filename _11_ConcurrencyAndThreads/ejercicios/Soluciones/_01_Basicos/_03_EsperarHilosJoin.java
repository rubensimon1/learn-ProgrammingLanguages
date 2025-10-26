package _11_ConcurrencyAndThreads.ejercicios.Soluciones._01_Basicos;

class HiloJoin extends Thread {
    private int id;

    public HiloJoin(int id) { this.id = id; }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hilo " + id + " - paso " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class _03_EsperarHilosJoin {
    public static void main(String[] args) throws InterruptedException {
        HiloJoin h1 = new HiloJoin(1);
        HiloJoin h2 = new HiloJoin(2);
        HiloJoin h3 = new HiloJoin(3);

        h1.start(); h2.start(); h3.start();
        h1.join(); h2.join(); h3.join();

        System.out.println("Todos los hilos han finalizado.");
    }
}
