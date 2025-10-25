package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Animal con método hacerSonido().
 * Crea una clase Perro que herede de Animal y sobrescriba el método.
 */

class Animal {
    void hacerSonido() {
        System.out.println("🐾 Sonido genérico de animal");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("🐶 El perro ladra: ¡Guau!");
    }
}

public class _06_Herencia {
    public static void main(String[] args) {
        Animal a = new Animal();
        Perro p = new Perro();

        a.hacerSonido();
        p.hacerSonido();
    }
}
