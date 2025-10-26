package _13_TestingAndValidation.ejercicios._07_MaximoArray;

public class _07_MaximoArray {
    public static int maximo(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array vacío o nulo");
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 9, 4};
        System.out.println("Máximo del array: " + maximo(numeros));
    }
}
