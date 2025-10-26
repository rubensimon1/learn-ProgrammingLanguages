package _11_ConcurrencyAndThreads.ejercicios.Soluciones._02_Intermedios;

class ContadorSync {
    private int valor = 0;

    public synchronized void incrementar() { valor++; }

    public int getValor() { return valor; }
}

class HiloContadorSync extends Thread {
    private ContadorSync contador;

    public HiloContadorSync(ContadorSync contador) { this.contador = contador; }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.incrementar();
        }
    }
}

public class _05_ContadorSincronizado {
    public static void main(String[] args) throws InterruptedException {
        ContadorSync c = new ContadorSync();

        HiloContadorSync h1 = new HiloContadorSync(c);
        HiloContadorSync h2 = new HiloContadorSync(c);

        h1.start(); h2.start();
        h1.join(); h2.join();

        System.out.println("Valor final seguro: " + c.getValor());
    }
}
