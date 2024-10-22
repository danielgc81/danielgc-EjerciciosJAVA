package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String txt = sc.nextLine();

        StringBuilder palindromo = new StringBuilder(txt).reverse();
        System.out.println(palindromo);
    }
}
