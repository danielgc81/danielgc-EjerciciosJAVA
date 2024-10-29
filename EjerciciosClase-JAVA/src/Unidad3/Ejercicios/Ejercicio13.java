package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    // Escribe un metodo que acepte una cadena y retorne otra obtenida como resultado de intercambiar
    // cada par de caracteres. Si el número de caracteres es impar, el último se queda como está

    static String intercambiar(String s) {
        StringBuilder myStr = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            if (i != s.length() - 1) {
                myStr.append(s.charAt(i + 1));
            }
            myStr.append(s.charAt(i));
        }

        return myStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String s = sc.nextLine();

        System.out.println(intercambiar(s));
    }
}
