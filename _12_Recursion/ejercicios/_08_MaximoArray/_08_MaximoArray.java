package _12_Recursion.ejercicios._08_MaximoArray;

public class _08_MaximoArray {
    public static int maximo(int[] arr, int index) {
        if (index == 0) return arr[0];
        int maxPrev = maximo(arr, index - 1);
        return arr[index] > maxPrev ? arr[index] : maxPrev;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 9, 4};
        System.out.println("Máximo del array: " + maximo(numeros, numeros.length - 1));
    }
}
