package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    // Escribe un metodo que acepte una cadena y retorne la suma de todos los dígitos que contenga.
    //      Ejemplo: "la suma de 123 y 321 es igual a 444"  24 (1+2+3+3+2+1+4+4+4)
    // Escribe un programa que lo ponga a prueba.

    static String sumaDigitos(String s) {
        int suma = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                suma += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }

        if (suma == 0) {
            return String.format("No hay números en la frase");
        } else {
            return String.format("La suma de los dígitos da %d" , suma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase con dígitos: ");
        String s = sc.nextLine();

        System.out.println(sumaDigitos(s));
    }
}
