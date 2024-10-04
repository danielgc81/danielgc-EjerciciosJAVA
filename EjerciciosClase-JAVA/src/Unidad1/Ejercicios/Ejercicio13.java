package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double m1;
        double m2;
        double distancia;

        System.out.println("Introduce la masa 1: ");
        m1 = sc.nextDouble();

        System.out.println("Introduce la masa 2: ");
        m2 = sc.nextDouble();

        System.out.println("Introduce la distancia entre objetos: ");
        distancia = sc.nextDouble();

        final double constanteGravitación = 6.67384e-11;
        double fuerzaGravitacional = constanteGravitación * (m1 * m2) / (Math.pow(distancia,2));

        System.out.printf("La fuerza gravitacional entre estos dos objetos es de %.3f N",fuerzaGravitacional);
    }
}
