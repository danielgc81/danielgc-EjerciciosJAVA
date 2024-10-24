package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Escribe un programa que lea dos cadenas y muestre el número de veces que la segunda está contenida en la primera

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un texto: ");
        String txt = sc.nextLine();

        System.out.println("Escribe la palabra que quieres ver cuantas veces esta contenida en el texto anterior: ");
        String txtContenido = sc.next();
        int contador = 0;
        int indice = 0;

        while ((indice = txt.indexOf(txtContenido, indice)) != -1) {
            contador++;
            indice += txtContenido.length();
        }

        System.out.println("Esta " + contador + " veces contenida en el texto");
    }
}
