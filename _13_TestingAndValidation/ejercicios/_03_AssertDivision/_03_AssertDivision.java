package _13_TestingAndValidation.ejercicios._03_AssertDivision;

public class _03_AssertDivision {
    public static int dividir(int a, int b) {
        assert b != 0 : "El divisor no puede ser cero";
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("10 / 2 = " + dividir(10, 2));
        // System.out.println("10 / 0 = " + dividir(10, 0)); // Para probar assert
    }
}
