package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        year = sc.nextInt();

        boolean esBisiesto = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        System.out.println("¿Es Bisiesto?: " + esBisiesto);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Bisiesto");
                } else {
                    System.out.println("No bisiesto");
                }
            } else {
                System.out.println("Bisiesto");
            }
        } else {
            System.out.println("No bisiesto");
        }

        sc.close();
    }
}
