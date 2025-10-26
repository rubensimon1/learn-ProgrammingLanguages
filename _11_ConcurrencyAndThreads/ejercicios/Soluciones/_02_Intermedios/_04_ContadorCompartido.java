package _11_ConcurrencyAndThreads.ejercicios.Soluciones._02_Intermedios;

class Contador {
    public int valor = 0;
}

class HiloContador extends Thread {
    private Contador contador;

    public HiloContador(Contador contador) { this.contador = contador; }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.valor++;
        }
    }
}

public class _04_ContadorCompartido {
    public static void main(String[] args) throws InterruptedException {
        Contador c = new Contador();

        HiloContador h1 = new HiloContador(c);
        HiloContador h2 = new HiloContador(c);

        h1.start(); h2.start();
        h1.join(); h2.join();

        System.out.println("Valor final: " + c.valor);
        System.out.println("Se puede observar error si no se sincroniza.");
    }
}
