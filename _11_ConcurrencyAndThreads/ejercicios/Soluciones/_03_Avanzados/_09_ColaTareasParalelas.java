package _11_ConcurrencyAndThreads.ejercicios.Soluciones._03_Avanzados;

class Tarea extends Thread {
    private String mensaje;
    private int delay;
    public Tarea(String mensaje,int delay){ this.mensaje=mensaje; this.delay=delay; }
    public void run(){
        System.out.println("Iniciando: "+mensaje);
        try{ Thread.sleep(delay); }catch(InterruptedException e){}
        System.out.println("Finalizado: "+mensaje);
    }
}

public class _09_ColaTareasParalelas {
    public static void main(String[] args) throws InterruptedException {
        Tarea t1 = new Tarea("Tarea 1",500);
        Tarea t2 = new Tarea("Tarea 2",800);
        Tarea t3 = new Tarea("Tarea 3",300);

        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();

        System.out.println("Todas las tareas han terminado.");
    }
}
