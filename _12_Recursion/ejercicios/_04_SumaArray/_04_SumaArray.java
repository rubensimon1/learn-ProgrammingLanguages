package _12_Recursion.ejercicios._04_SumaArray;

public class _04_SumaArray {
    public static int sumaArray(int[] arr, int index) {
        if (index < 0) return 0;
        return arr[index] + sumaArray(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma del array: " + sumaArray(numeros, numeros.length - 1));
    }
}
