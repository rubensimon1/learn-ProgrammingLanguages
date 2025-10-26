package _12_Recursion.ejercicios._05_BusquedaRecursiva;

public class _05_BusquedaRecursiva {
    public static boolean buscar(int[] arr, int index, int objetivo) {
        if (index >= arr.length) return false;
        if (arr[index] == objetivo) return true;
        return buscar(arr, index + 1, objetivo);
    }

    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 9, 11};
        int objetivo = 7;
        System.out.println("¿Se encuentra " + objetivo + "? " + buscar(numeros, 0, objetivo));
    }
}
