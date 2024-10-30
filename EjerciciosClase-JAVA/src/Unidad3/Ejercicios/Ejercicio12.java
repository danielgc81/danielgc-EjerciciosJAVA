package Unidad3.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    // Escribe un metodo que acepte dos cadenas y retorne un valor que indique si la segunda es un
    // anagrama de la primera.

    public static boolean esAnagrama(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arrS1 = s1.toLowerCase().toCharArray();
        char[] arrS2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arrS1);
        Arrays.sort(arrS2);

        return Arrays.equals(arrS1,arrS2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String s1 = sc.next().toLowerCase();
        System.out.println("Introduce otra palabra: ");
        String s2 = sc.next().toLowerCase();

        if (esAnagrama(s1, s2)) {
            System.out.println(s2 + " es anagrama de " + s1);
        } else {
            System.out.println(s2 + " no es anagrama de " + s1);
        }
    }
}
