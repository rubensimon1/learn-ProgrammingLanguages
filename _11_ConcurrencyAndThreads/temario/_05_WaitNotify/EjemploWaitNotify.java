package _11_ConcurrencyAndThreads.temario._05_WaitNotify;

class Buffer {
    private int valor;
    private boolean disponible = false;

    public synchronized void producir(int v) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Productor interrumpido");
            }
        }
        valor = v;
        disponible = true;
        System.out.println("Producido: " + valor);
        notify();
    }

    public synchronized int consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumidor interrumpido");
            }
        }
        disponible = false;
        System.out.println("Consumido: " + valor);
        notify();
        return valor;
    }
}

public class EjemploWaitNotify {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread productor = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    buffer.producir(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {}
                }
            }
        });

        Thread consumidor = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    buffer.consumir();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        });

        productor.start();
        consumidor.start();
    }
}
