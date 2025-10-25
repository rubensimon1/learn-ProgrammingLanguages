package _01_Languages.Java.src._05_excepciones;

/*
 * 🧩 Enunciado:
 * Realiza una división entre dos números.
 * Controla que el divisor no sea cero y que el usuario introduzca números válidos.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_MultiplesCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No puedes dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes introducir números enteros.");
        } finally {
            sc.close();
            System.out.println("🔚 Programa finalizado.");
        }
    }
}
