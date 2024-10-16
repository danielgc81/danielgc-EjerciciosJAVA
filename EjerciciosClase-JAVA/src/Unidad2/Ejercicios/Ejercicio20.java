package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        // Escribe un programa que pida un número n por teclado y dibuje en la consola triángulos usando asteriscos

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Aquí tienes tus triángulos");
        int asteriscos = num;

        // Triangulo 1
        for (int i = 0; i < num; i++) {
            for (int a = 0; a < asteriscos; a++) {
                System.out.print("* "); // No lo escribo como un caracter porque en la consola hay un error de escritura
            }
            asteriscos--;
            System.out.println();
        }

        System.out.println();

        // Triangulo 2
        for (int g = 0; g < num; g++){
            for (int j = 0; j < g; j++) {
                System.out.print("  ");
            }
            for (int h = 0; h < num - g; h++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        // Triangulo 3
        for (int f = 0; f <= num; f++) {
            for (int d = 0; d > asteriscos; d--) {
                System.out.print("* ");
            }
            asteriscos--;
            System.out.println();
        }

        System.out.println();

        // Triangulo 4
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        // Triangulo 5
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        // Triangulo 6
        for (int g = 0; g < num; g++){
            for (int j = 0; j < g; j++) {
                System.out.print(" ");
            }
            for (int h = num - g; h > 0; h--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
