package _12_Recursion.ejercicios._06_InvertirCadena;

public class _06_InvertirCadena {
    public static String invertir(String texto) {
        if (texto.isEmpty()) return "";
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        String palabra = "Java";
        System.out.println("Original: " + palabra);
        System.out.println("Invertida: " + invertir(palabra));
    }
}
