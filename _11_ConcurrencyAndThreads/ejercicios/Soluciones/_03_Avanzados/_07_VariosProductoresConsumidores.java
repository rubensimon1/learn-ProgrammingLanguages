package _11_ConcurrencyAndThreads.ejercicios.Soluciones._03_Avanzados;

class BufferAvanzado {
    private int valor;
    private boolean disponible = false;

    public synchronized void producir(int v) {
        while(disponible){ try{ wait(); }catch(InterruptedException e){} }
        valor = v; disponible = true;
        System.out.println("Producido: " + valor);
        notifyAll();
    }

    public synchronized int consumir() {
        while(!disponible){ try{ wait(); }catch(InterruptedException e){} }
        disponible = false;
        System.out.println("Consumido: " + valor);
        notifyAll();
        return valor;
    }
}

class ProductorAvanzado extends Thread {
    private BufferAvanzado buffer;
    private int id;
    public ProductorAvanzado(BufferAvanzado b, int id){ buffer=b; this.id=id; }
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.producir(i + id*10);
            try{Thread.sleep(200);}catch(InterruptedException e){}
        }
    }
}

class ConsumidorAvanzado extends Thread {
    private BufferAvanzado buffer;
    private int id;
    public ConsumidorAvanzado(BufferAvanzado b,int id){ buffer=b; this.id=id; }
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.consumir();
            try{Thread.sleep(400);}catch(InterruptedException e){}
        }
    }
}

public class _07_VariosProductoresConsumidores {
    public static void main(String[] args){
        BufferAvanzado b = new BufferAvanzado();
        ProductorAvanzado p1 = new ProductorAvanzado(b,1);
        ProductorAvanzado p2 = new ProductorAvanzado(b,2);
        ConsumidorAvanzado c1 = new ConsumidorAvanzado(b,1);
        ConsumidorAvanzado c2 = new ConsumidorAvanzado(b,2);

        p1.start(); p2.start(); c1.start(); c2.start();
    }
}
