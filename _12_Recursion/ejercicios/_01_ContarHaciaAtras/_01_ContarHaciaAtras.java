package _12_Recursion.ejercicios._01_ContarHaciaAtras;

public class _01_ContarHaciaAtras {
    public static void contar(int n) {
        if (n <= 0) return;
        System.out.println(n);
        contar(n - 1);
    }

    public static void main(String[] args) {
        contar(10);
    }
}
