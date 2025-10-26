package _06_MiniProjects.src.Java._05_BibliotecaMini;

import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    String titulo;
    String autor;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString() {
        return titulo + " - " + autor;
    }
}

public class BibliotecaMini {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String accion;

        do {
            System.out.print("Acción (agregar/listar/buscar/salir): ");
            accion = sc.nextLine().toLowerCase();

            switch (accion) {
                case "agregar":
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    libros.add(new Libro(titulo, autor));
                    break;
                case "listar":
                    for (Libro l : libros) System.out.println(l);
                    break;
                case "buscar":
                    System.out.print("Título a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Libro l : libros) {
                        if (l.titulo.equalsIgnoreCase(buscar)) {
                            System.out.println(l);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) System.out.println("No encontrado");
                    break;
                case "salir": break;
                default: System.out.println("Acción no válida");
            }
        } while (!accion.equals("salir"));

        sc.close();
    }
}
