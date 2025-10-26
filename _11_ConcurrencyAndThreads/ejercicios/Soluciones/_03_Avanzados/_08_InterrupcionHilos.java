package _11_ConcurrencyAndThreads.ejercicios.Soluciones._03_Avanzados;

class HiloLargo extends Thread {
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("Trabajando... paso " + i);
            try { Thread.sleep(1000); } catch(InterruptedException e){
                System.out.println("Hilo interrumpido.");
                return;
            }
        }
        System.out.println("Hilo completado normalmente.");
    }
}

public class _08_InterrupcionHilos {
    public static void main(String[] args) throws InterruptedException {
        HiloLargo hilo = new HiloLargo();
        hilo.start();
        Thread.sleep(3000);
        hilo.interrupt();
    }
}
