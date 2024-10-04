package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        // Escribe un programa que convierta euros a dólares. El dato de entrada será la cantidad en euros y el
        // dato de salida será la cantidad correspondiente en dólares, con una precisión de 2 decimales

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros para convertirlos en dolares: ");
        double euros = sc.nextDouble();

        double dolares = euros * 1.09;
        System.out.printf("%.2f euros son %.2f dolares.", euros, dolares);
        sc.close();
    }
}
