package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una interfaz Reproducible con método reproducir().
 * Implementa la interfaz en las clases Cancion y Video.
 */

interface Reproducible {
    void reproducir();
}

class Cancion implements Reproducible {
    public void reproducir() {
        System.out.println("🎵 Reproduciendo canción...");
    }
}

class Video implements Reproducible {
    public void reproducir() {
        System.out.println("🎬 Reproduciendo video...");
    }
}

public class _10_Interfaces {
    public static void main(String[] args) {
        Reproducible r1 = new Cancion();
        Reproducible r2 = new Video();

        r1.reproducir();
        r2.reproducir();
    }
}

