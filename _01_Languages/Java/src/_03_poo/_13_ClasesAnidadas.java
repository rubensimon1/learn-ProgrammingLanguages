package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase Externa con una clase interna (anidada).
 * La interna debe poder acceder a los atributos de la externa.
 */

class Externa {
    private String mensaje = "Hola desde la clase externa";

    class Interna {
        void mostrarMensaje() {
            System.out.println("📩 " + mensaje);
        }
    }
}

public class _13_ClasesAnidadas {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
