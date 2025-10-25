package _01_Languages.Java.src._04_ficheros;

/*
 * 🧩 Enunciado:
 * Crea una clase Persona serializable.
 * Guarda un objeto en un archivo y recupéralo con ObjectInputStream.
 */

import java.io.*;

class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

public class _06_SerializacionObjetos {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"));
            oos.writeObject(new Persona("Lucía", 22));
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"));
            Persona p = (Persona) ois.readObject();
            ois.close();

            System.out.println("✅ Objeto leído: " + p);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
