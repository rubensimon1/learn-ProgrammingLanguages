package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Calculadora con métodos sumar sobrecargados:
 * - sumar(int, int)
 * - sumar(double, double)
 */

class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}

public class _05_SobrecargaDeMetodos {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma int: " + calc.sumar(3, 5));
        System.out.println("Suma double: " + calc.sumar(3.2, 4.8));
    }
}
