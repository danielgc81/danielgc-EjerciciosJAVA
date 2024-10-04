package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        // Escribe un programa que le pregunte al usuario su nombre y a continuación muestre los segundos que
        // ha tardado en contestar con una precisión de milisegundos
        Scanner sc = new Scanner(System.in);
        long tiempoIncioScanner = System.currentTimeMillis();
        System.out.println("Dime tu nombre: ");
        String nombre = sc.next();
        long tiempoFinalScanner = System.currentTimeMillis();

        long tiempoTranscurrido = tiempoFinalScanner - tiempoIncioScanner;
        double segundosTranscurridos = tiempoTranscurrido / 1000.0;

        System.out.printf("Hola %s, has tardado %.3f segundos en decirme tu nombre", nombre, segundosTranscurridos);

        sc.close();
    }
}
