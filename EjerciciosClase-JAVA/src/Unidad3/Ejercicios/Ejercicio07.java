package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Escribe un programa que lea nombres y muestre el resultado de sustituir los caracteres centrales (todos
        // menos el primero y el último) por asteriscos. Se ha de tener en cuenta que cada nombre puede estar
        // precedido y/o seguido de un número arbitrario de espacios en blanco que se deben ignorar.
        // Resolver cada sustitución sin usar sentencias repetitivas.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine().trim();

        if (nombre.length() <= 2) {
            System.out.println(nombre);
        }

        char primero = nombre.charAt(0);
        char ultimo = nombre.charAt(nombre.length() - 1);

        String astericos = "*".repeat(nombre.length() - 2);

        System.out.println(primero + astericos + ultimo);
    }
}
