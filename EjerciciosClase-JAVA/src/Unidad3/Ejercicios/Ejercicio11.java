package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Escribe un programa que lea cadenas de caracteres por teclado y muestre para cada uno de sus
        // caracteres el code point que le asigna Unicode. Los caracteres repetidos sólo se mostrarán una vez.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);
            int valorUnicode = s.charAt(i);

            if (s.indexOf(caracter) == i) {
                if (caracter == ' ') {
                    System.out.print("Espacio en blanco -> " + valorUnicode + " ");
                } else {
                    System.out.print(caracter + " -> " + valorUnicode + "  ");
                }
            }
        }

        sc.close();
    }
}
