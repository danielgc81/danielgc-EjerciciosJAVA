package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        /*
         * Escribe un programa que genere números aleatorios enteros comprendidos entre
         * 100 y 999 aleatorios y los vaya sumando hasta que dicha suma supere un valor
         * previamente introducido por teclado.
         *
         * Mostrar finalmente el valor acumulado y la cantidad de números acumulados.
         *
         * Versión 2: cómo hacer que el programa funcione aunque el usuario introduzca
         * un número negativo.
         *
         */

        int acumulador = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();

        do {
            double numeroRandom = (int) (Math.random() * 999) + 100;
            acumulador += numeroRandom;
            contador++;
        } while (acumulador <= num);

        if (contador == 1){
            System.out.println("Se ha necesitado un número para alcanzar el número introducido");
        } else {
            System.out.println("Se han necesitado " + contador + " números para alcanzar el número introducido");
            System.out.println("La suma de los numeros generados da: " + acumulador);
        }
    }
}
