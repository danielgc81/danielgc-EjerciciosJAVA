package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args){
        // Escribe un programa que simule el lanzamiento de un dado N veces, siendo N un número entero que se
        // pedirá por teclado. Después de simular los lanzamientos, el programa mostrará cuantas veces salió
        // cada una de las caras y le dará al usuario la opción de repetir el proceso

        String cara = "cara";
        String cruz = "cruz";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("¿Cuantos lanzamientos de moneda deseas realizar?");
            int lanzamientos = sc.nextInt();
            int caraCantidad = 0;
            int cruzCantidad = 0;

            for (int i = 1; i <= lanzamientos; i++){
                double n = Math.random();
                if (n < 0.5) {
                    System.out.println(cara);
                    caraCantidad++;
                } else if (n > 0.5){
                    System.out.println(cruz);
                    cruzCantidad++;
                }
            }

            if (caraCantidad == cruzCantidad) {
                double n = Math.random();
                if (n < 0.5) {
                    System.out.println(cara);
                    caraCantidad++;
                } else if (n > 0.5){
                    System.out.println(cruz);
                    cruzCantidad++;
                }
            }

            System.out.println();
            System.out.println("Cara: " + caraCantidad + "\t Cruz: " + cruzCantidad);

            System.out.println("¿Deseas repetir lanzamientos? (Cualquier número: Si, 0: No)");
            int respuesta = sc.nextInt();

            if (respuesta == 0){
                System.exit(0);
            }
        }
    }
}
