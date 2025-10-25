package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 7: Arrays y Promedios
Pide 5 notas, guárdalas en un array y muestra el promedio.
*/

import java.util.Scanner;

public class _07_PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Ingrese nota " + (i + 1) + " (0-10): ");
                notas[i] = sc.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);
            suma += notas[i];
        }

        System.out.println("Promedio: " + (suma / notas.length));
        sc.close();
    }
}
