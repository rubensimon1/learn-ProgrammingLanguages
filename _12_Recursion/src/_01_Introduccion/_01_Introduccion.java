package _12_Recursion.src._01_Introduccion;

public class _01_Introduccion {
    public static void contar(int n) {
        if (n <= 0) return;
        System.out.println("Número: " + n);
        contar(n - 1); // llamada recursiva
    }

    public static void main(String[] args) {
        System.out.println("Contando de 5 a 1:");
        contar(5);
    }
}
