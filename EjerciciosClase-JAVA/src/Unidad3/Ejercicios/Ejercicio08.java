package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    // Escribe un método que acepte dos cadenas y un índice y retorne el resultado
    // de insertar la segunda en la primera en la posición indicada por el índice

    // Primera forma de solucionar el programa
    static String insertarStrings (String s1, String s2, int i) {
        StringBuilder strFinal = new StringBuilder(s1).insert(i, s2);
        return strFinal.toString();
    }

    // Segunda forma de solucionar el programa
    static String insertarStrings2 (String s1, String s2, int i) {
        String strInicio = s1.substring(0,i);
        String strFinal = s1.substring(i);

        return strInicio + s2 + strFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto: ");
        String s1 = sc.nextLine();

        System.out.println("Escribe el texto que quieres insertar en el anterior: ");
        String s2 = sc.nextLine();

        System.out.println("Indica el indice del texto donde lo quieres insertar: ");
        int i = sc.nextInt();

        System.out.println(insertarStrings( s1, s2, i));
        System.out.println(insertarStrings2( s1, s2, i));

        sc.close();
    }
}
