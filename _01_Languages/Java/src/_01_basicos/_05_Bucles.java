package _01_Languages.Java.src._01_basicos;

/*
 * 🧩 Enunciado:
 * Muestra los números del 1 al 10 usando:
 * - un bucle for
 * - un bucle while
 * - un bucle do-while
 */

public class _05_Bucles {
    public static void main(String[] args) {

        System.out.println("🔹 Bucle for:");
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println("\n🔹 Bucle while:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n🔹 Bucle do-while:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}
