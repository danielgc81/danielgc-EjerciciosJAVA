package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Escribe un programa que lea nombres y construya un triángulo. El programa finalizará cuando lea la palabra fin.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduce un nombre de persona (fin para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")){
                break;
            }

            for (int i = 0; i <= nombre.length(); i++) {
                System.out.println(nombre.substring(0,i));
            }
        }
    }
}
