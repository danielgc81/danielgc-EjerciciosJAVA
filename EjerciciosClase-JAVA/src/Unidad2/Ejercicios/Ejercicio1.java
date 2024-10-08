package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        // Escribe un programa que calcule la división exacta de dos números introducidos por teclado. Si el
        // divisor es cero, se abortará el proceso mostrando un mensaje de error
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor a:");
        num1 = sc.nextDouble();
        System.out.println("Valor b:");
        num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("ERROR: El divisor no puede ser cero");
        } else {
            double division = num1 / num2;
            System.out.printf("La division da %.2f", division);
        }
    }
}
