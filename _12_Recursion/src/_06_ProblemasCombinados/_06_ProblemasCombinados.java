package _12_Recursion.src._06_ProblemasCombinados;

public class _06_ProblemasCombinados {
    // Recursión para invertir un string
    public static String invertir(String texto) {
        if (texto.isEmpty()) return ""; // caso base
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {
        String palabra = "Java";
        System.out.println("Palabra original: " + palabra);
        System.out.println("Palabra invertida: " + invertir(palabra));
    }
}
