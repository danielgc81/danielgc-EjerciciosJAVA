package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        //Escribe un programa que calcule el espacio recorrido por un vehículo con una velocidad inicial de 5 m/s
        //y una aceleración de 2 m/s2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo transcurrido: ");
        double tiempoTranscurrido = sc.nextInt();

        final double velocidad = 5;
        final double aceleración = 2;
        
        double espacioRecorrido = (velocidad * tiempoTranscurrido) + (0.5 * aceleración * Math.pow(tiempoTranscurrido, 2));
        System.out.printf("El vehículo ha recorrido %.2f metros", espacioRecorrido);
        sc.close();
        }
    }

