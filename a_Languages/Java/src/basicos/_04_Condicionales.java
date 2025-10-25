package a_Languages.Java.src.basicos;

import java.util.Scanner;

/**
 * Ejemplo de estructuras condicionales: if, else if, else y switch.
 */

public class _04_Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nota (0-10): ");
        int nota = sc.nextInt();

        if (nota >= 9) {
            System.out.println("Excelente 🏆");
        } else if (nota >= 7) {
            System.out.println("Notable 👍");
        } else if (nota >= 5) {
            System.out.println("Aprobado ✅");
        } else {
            System.out.println("Suspendido ❌");
        }

        // Ejemplo con switch
        System.out.print("Introduce un día (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6, 7 -> System.out.println("Fin de semana 😎");
            default -> System.out.println("Número inválido");
        }

        sc.close();
    }
}
