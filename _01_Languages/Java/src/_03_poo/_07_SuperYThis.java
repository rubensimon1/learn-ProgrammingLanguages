package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Vehiculo con atributo marca.
 * Crea una clase Moto que herede de Vehiculo y use super() para inicializar la marca.
 */

class Vehiculo {
    String marca;

    Vehiculo(String marca) {
        this.marca = marca;
    }
}

class Moto extends Vehiculo {
    int cilindrada;

    Moto(String marca, int cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
    }

    void mostrarInfo() {
        System.out.println("🏍️ " + marca + " de " + cilindrada + "cc");
    }
}

public class _07_SuperYThis {
    public static void main(String[] args) {
        Moto m = new Moto("Yamaha", 125);
        m.mostrarInfo();
    }
}
