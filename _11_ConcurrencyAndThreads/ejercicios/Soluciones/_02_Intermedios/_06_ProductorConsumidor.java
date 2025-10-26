package _11_ConcurrencyAndThreads.ejercicios.Soluciones._02_Intermedios;

class Buffer {
    private int valor;
    private boolean disponible = false;

    public synchronized void producir(int v) {
        while(disponible) { try { wait(); } catch(InterruptedException e){} }
        valor = v; disponible = true;
        System.out.println("Producido: " + valor);
        notify();
    }

    public synchronized int consumir() {
        while(!disponible) { try { wait(); } catch(InterruptedException e){} }
        disponible = false;
        System.out.println("Consumido: " + valor);
        notify();
        return valor;
    }
}

class Productor extends Thread {
    private Buffer buffer;
    public Productor(Buffer buffer) { this.buffer = buffer; }
    public void run() {
        for(int i=1;i<=10;i++){
            buffer.producir(i);
            try{Thread.sleep(200);}catch(InterruptedException e){}
        }
    }
}

class Consumidor extends Thread {
    private Buffer buffer;
    public Consumidor(Buffer buffer){ this.buffer = buffer; }
    public void run(){
        for(int i=1;i<=10;i++){
            buffer.consumir();
            try{Thread.sleep(400);}catch(InterruptedException e){}
        }
    }
}

public class _06_ProductorConsumidor {
    public static void main(String[] args){
        Buffer b = new Buffer();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        p.start(); c.start();
    }
}
