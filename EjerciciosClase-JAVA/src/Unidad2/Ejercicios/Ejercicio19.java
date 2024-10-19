package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        // Escribe un programa que genere él triangulo de Floyd para un número de filas introducido por teclado y
        // lo muestre por pantalla

        int filas;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas filas deseas introducir?");
        filas = sc.nextInt();
        int numero = 1;

        for (int i = 1; i <= filas; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }

        sc.close();
    }
}
