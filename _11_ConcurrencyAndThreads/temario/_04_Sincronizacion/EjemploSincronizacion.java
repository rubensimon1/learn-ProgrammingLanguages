package _11_ConcurrencyAndThreads.temario._04_Sincronizacion;

class Contador {
    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }
}

class HiloContador extends Thread {
    private Contador contador;

    public HiloContador(Contador contador) {
        this.contador = contador;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.incrementar();
        }
    }
}

public class EjemploSincronizacion {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        HiloContador t1 = new HiloContador(contador);
        HiloContador t2 = new HiloContador(contador);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}
