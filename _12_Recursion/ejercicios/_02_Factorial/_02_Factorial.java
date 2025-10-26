package _12_Recursion.ejercicios._02_Factorial;

public class _02_Factorial {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial de " + num + " = " + factorial(num));
    }
}
