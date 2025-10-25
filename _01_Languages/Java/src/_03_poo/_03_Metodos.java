package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Coche con métodos arrancar(), acelerar() y frenar().
 * Muestra mensajes que simulen el comportamiento.
 */

class Coche {
    String modelo;
    int velocidad = 0;

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    void arrancar() {
        System.out.println("🚗 El " + modelo + " ha arrancado.");
    }

    void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("⚡ Velocidad actual: " + velocidad + " km/h");
    }

    void frenar() {
        velocidad = 0;
        System.out.println("🛑 El coche se ha detenido.");
    }
}

public class _03_Metodos {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota");
        coche1.arrancar();
        coche1.acelerar(50);
        coche1.frenar();
    }
}
