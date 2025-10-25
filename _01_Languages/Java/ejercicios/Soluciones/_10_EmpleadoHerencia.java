package _01_Languages.Java.ejercicios.Soluciones;

/*
Ejercicio 10: Herencia y Polimorfismo
Empleado hereda de Persona, añade salario y sobrescribe mostrarDatos().
*/

class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}

public class _10_EmpleadoHerencia {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 28);
        Empleado e = new Empleado("Laura", 35, 2500);

        p.mostrarDatos();
        e.mostrarDatos();
    }
}
