package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        // Escribe un programa que calcule el perímetro y el área de un círculo a partir de su radio
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo: ");
        radio = sc.nextInt();

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * (Math.pow( radio, 2));

        System.out.printf("\u001B[31mPerímetro: %.2f cm \n\u001B[34mÁrea: %.2f cm2", perimetro, area);
        sc.close();
    }
}
