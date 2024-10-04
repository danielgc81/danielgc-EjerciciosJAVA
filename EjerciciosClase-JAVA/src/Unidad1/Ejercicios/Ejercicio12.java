package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor del Rojo (0 - 255): ");
        double r = sc.nextDouble();
        if(r > 255 || r < 0) {
            while(r > 255 || r < 0){
                System.out.println("\u001B[31mERROR: Valor Incorrecto");
                System.out.println("Vuelve a introducir un numero correcto\u001B[0m");
                System.out.println("Valor del Rojo (0 - 255): ");
                r = sc.nextDouble();
            }
        }

        System.out.println("Valor del Verde (0 - 255): ");
        double g = sc.nextDouble();
        if(g > 255 || g < 0) {
            while(g > 255 || g < 0){
                System.out.println("\u001B[31mERROR: Valor Incorrecto");
                System.out.println("Vuelve a introducir un numero correcto\u001B[0m");
                System.out.println("Valor del Verde (0 - 255): ");
                g = sc.nextDouble();
            }
        }

        System.out.println("Valor del Azul (0 - 255): ");
        double b = sc.nextDouble();
        if(b > 255 || b < 0){
            while(b > 255 || b < 0){
                System.out.println("\u001B[31mERROR: Valor Incorrecto");
                System.out.println("Vuelve a introducir un numero correcto\u001B[0m");
                System.out.println("Valor del Azul (0 - 255): ");
                b = sc.nextDouble();
            }
        }

        double y = 0.299 * r + 0.587 * g + 0.114 * b;
        double i = 0.596 * r - 0.275 * g - 0.321 * b;
        double q = 0.212 * r - 0.528 * g + 0.311 * b;

        System.out.printf("Y: %.3f, I: %.3f, Q: %.3f", y, i ,q);

        sc.close();
    }
}
