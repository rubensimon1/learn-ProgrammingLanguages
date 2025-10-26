package _13_TestingAndValidation.ejercicios._04_ValidarCadena;

import java.util.Scanner;

public class _04_ValidarCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        do {
            System.out.print("Introduce un texto no vacío: ");
            texto = sc.nextLine();
        } while (texto == null || texto.trim().isEmpty());
        System.out.println("Texto válido: " + texto);
    }
}
