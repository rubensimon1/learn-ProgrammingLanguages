package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Usa el polimorfismo para que diferentes tipos de animales hagan sonidos.
 */

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("🐱 El gato maúlla: ¡Miau!");
    }
}

public class _08_Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Perro();
        Animal a2 = new Gato();

        a1.hacerSonido();
        a2.hacerSonido();
    }
}
