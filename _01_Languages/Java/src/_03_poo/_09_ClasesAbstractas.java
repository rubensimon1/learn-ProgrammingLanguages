package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase abstracta Figura con método abstracto calcularArea().
 * Crea clases concretas: Cuadrado y Circulo.
 */

abstract class Figura {
    abstract double calcularArea();
}

class Cuadrado extends Figura {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class _09_ClasesAbstractas {
    public static void main(String[] args) {
        Figura f1 = new Cuadrado(4);
        Figura f2 = new Circulo(3);

        System.out.println("Área cuadrado: " + f1.calcularArea());
        System.out.println("Área círculo: " + f2.calcularArea());
    }
}
