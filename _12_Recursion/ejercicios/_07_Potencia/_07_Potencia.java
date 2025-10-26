package _12_Recursion.ejercicios._07_Potencia;

public class _07_Potencia {
    public static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^5 = " + potencia(2, 5));
    }
}
