package _12_Recursion.ejercicios._09_Palindromo;

public class _09_Palindromo {
    public static boolean esPalindromo(String texto) {
        if (texto.length() <= 1) return true;
        if (texto.charAt(0) != texto.charAt(texto.length() - 1)) return false;
        return esPalindromo(texto.substring(1, texto.length() - 1));
    }

    public static void main(String[] args) {
        String palabra = "radar";
        System.out.println(palabra + " es palíndromo? " + esPalindromo(palabra));
    }
}
