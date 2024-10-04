package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        //Escribe un programa que lea por teclado las coordenadas cartesianas (x, y) de un punto en plano y las
        //convierta a coordenadas polares (r, )

        Scanner sc = new Scanner(System.in);
        double x;
        double y;

        System.out.println("Punto X: ");
        x = sc.nextDouble();

        System.out.println("Punto Y: ");
        y = sc.nextDouble();

        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double O = Math.pow(Math.tan(y / x), -1);

        System.out.printf("(%.2f,%.2f)", r, O);
    }
}
