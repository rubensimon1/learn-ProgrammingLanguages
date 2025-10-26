package _06_MiniProjects.src.Java._02_CalculadoraBasica;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double num2 = sc.nextDouble();
        System.out.print("Operación (+,-,*,/): ");
        String op = sc.next();

        switch (op) {
            case "+": System.out.println("Resultado: " + (num1 + num2)); break;
            case "-": System.out.println("Resultado: " + (num1 - num2)); break;
            case "*": System.out.println("Resultado: " + (num1 * num2)); break;
            case "/": 
                if (num2 != 0) System.out.println("Resultado: " + (num1 / num2));
                else System.out.println("Error: división entre 0");
                break;
            default: System.out.println("Operación no válida");
        }

        sc.close();
    }
}
