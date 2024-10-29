package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    // Escribe un programa que lea líneas de texto por teclado y muestre el resultado de eliminar todos los
    // caracteres duplicados en cada una de ellas

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String s = sc.nextLine();

        StringBuilder myStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (myStr.toString().indexOf(s.charAt(i)) == -1) {
                myStr.append(s.charAt(i));
            }
        }
        System.out.println(myStr);
    }
}
