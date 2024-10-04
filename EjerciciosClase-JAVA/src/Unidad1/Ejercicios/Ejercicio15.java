package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        //Escribe un programa que resuelva la ecuación de 2º grado 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0. El usuario deberá
        //introducir por teclado los valores de a, b y c.

        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        a = sc.nextDouble();

        System.out.println("Introduce el valor de b: ");
        b = sc.nextDouble();

        System.out.println("Introduce el valor de c: ");
        c = sc.nextDouble();

        if (a == 0){
            System.out.println("El valor de a no puede ser 0. No es una ecuación de segundo grado");
        } else {
            double discriminante = Math.pow(b,2) - 4 * a * c;

            if (discriminante > 0){
                double x1 = -b + Math.sqrt(discriminante) / (2 * a);
                double x2 = -b - Math.sqrt(discriminante) / (2 * a);
                System.out.printf("Las soluciones son x1 = %.2f \n x2 = %.2f", x1, x2);
            } else if (discriminante == 0){
                double x1 = -b / (2 * a);
                System.out.printf("La solución es x1 = %.2f", x1);
            } else {
                System.out.println("No hay solución");
            }
        }
        sc.close();
    }
}
