package _11_ConcurrencyAndThreads.ejercicios.Soluciones._01_Basicos;

class HiloParalelo extends Thread {
    private String mensaje;
    private int delay;

    public HiloParalelo(String mensaje, int delay) {
        this.mensaje = mensaje;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(mensaje + " - paso " + i);
            try { Thread.sleep(delay); } catch (InterruptedException e) {}
        }
    }
}

public class _02_DosHilosEnParalelo {
    public static void main(String[] args) {
        HiloParalelo h1 = new HiloParalelo("Hilo 1", 500);
        HiloParalelo h2 = new HiloParalelo("Hilo 2", 800);

        h1.start();
        h2.start();
    }
}
