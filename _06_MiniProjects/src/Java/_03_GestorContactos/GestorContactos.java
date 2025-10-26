package _06_MiniProjects.src.Java._03_GestorContactos;

import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    String nombre;
    String telefono;

    Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String toString() {
        return nombre + " - " + telefono;
    }
}

public class GestorContactos {
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String accion;

        do {
            System.out.print("Acción (añadir/listar/buscar/salir): ");
            accion = sc.nextLine().toLowerCase();

            switch (accion) {
                case "añadir":
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    contactos.add(new Contacto(nombre, telefono));
                    break;
                case "listar":
                    for (Contacto c : contactos) System.out.println(c);
                    break;
                case "buscar":
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Contacto c : contactos) {
                        if (c.nombre.equalsIgnoreCase(buscar)) {
                            System.out.println(c);
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
