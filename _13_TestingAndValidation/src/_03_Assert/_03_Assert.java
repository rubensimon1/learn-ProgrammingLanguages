package _13_TestingAndValidation.src._03_Assert;

public class _03_Assert {
    public static int division(int a, int b) {
        assert b != 0 : "El divisor no puede ser cero";
        return a / b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        System.out.println("10 / 2 = " + division(x, y));

        // Prueba con divisor 0 (descomentar para ver assert fallar)
        // System.out.println("10 / 0 = " + division(x, 0));
    }
}
