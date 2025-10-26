package _06_MiniProjects.src.Java._04_GuessTheWord;

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "JAVA";
        char[] palabraAdivinar = palabra.toCharArray();
        char[] progreso = new char[palabra.length()];

        for (int i = 0; i < progreso.length; i++) progreso[i] = '_';

        int intentos = 6;

        while (intentos > 0 && new String(progreso).contains("_")) {
            System.out.println("Palabra: " + new String(progreso));
            System.out.print("Letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabraAdivinar[i] == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }
            if (!acierto) {
                intentos--;
                System.out.println("Incorrecto. Intentos restantes: " + intentos);
            }
        }

        if (!new String(progreso).contains("_")) System.out.println("¡Ganaste! Palabra: " + palabra);
        else System.out.println("Perdiste. La palabra era: " + palabra);

        sc.close();
    }
}
