package _12_Recursion.src._03_Fibonacci;

public class _03_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n; // casos base
        return fibonacci(n - 1) + fibonacci(n - 2); // recursión
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Los primeros " + n + " números de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
