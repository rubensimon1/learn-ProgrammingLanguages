package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Libro que sobrescriba toString() y equals().
 */

class Libro {
    String titulo;
    String autor;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "📘 \"" + titulo + "\" de " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro otro = (Libro) obj;
        return titulo.equals(otro.titulo) && autor.equals(otro.autor);
    }
}

public class _12_ToStringYEquals {
    public static void main(String[] args) {
        Libro l1 = new Libro("1984", "George Orwell");
        Libro l2 = new Libro("1984", "George Orwell");
        Libro l3 = new Libro("Fahrenheit 451", "Bradbury");

        System.out.println(l1);
        System.out.println("¿l1 == l2? " + l1.equals(l2));
        System.out.println("¿l1 == l3? " + l1.equals(l3));
    }
}
