package _06_MiniProjects.src.Java._01_AdivinaNumero;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(50) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 50:");

        do {
            intento = sc.nextInt();
            if (intento < numero) System.out.println("Demasiado bajo");
            else if (intento > numero) System.out.println("Demasiado alto");
            else System.out.println("¡Correcto!");
        } while (intento != numero);

        sc.close();
    }
}
