package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        /*
        LATITUDES Y LONGITUDES DE LOS PUNTOS (Fleming y mis dos viviendas)
        latFleming = 43,35781;
        longFleming = -5,85569;
        latMoreda = 43,16736;
        longMoreda = -5,73686;
        */

        final double radioTierra = 6371.01;
        Scanner sc = new Scanner(System.in);
        System.out.println("Latitud Fleming: ");
        double latFleming = sc.nextDouble();

        System.out.println("Longitud Fleming: ");
        double longFleming = sc.nextDouble();

        System.out.println("Latitud Moreda: ");
        double latMoreda = sc.nextDouble();

        System.out.println("Longitud Moreda: ");
        double longMoreda = sc.nextDouble();

        // Calculo de las distancias
        double distanciaFlemingMoreda = radioTierra * Math.acos(Math.sin(Math.toRadians(latFleming)) * Math.sin(Math.toRadians(latMoreda)) + Math.cos(Math.toRadians(latFleming)) * Math.cos(Math.toRadians(latMoreda)) * Math.cos(Math.toRadians(longMoreda) - Math.toRadians(longFleming)));

        // Resultado: 23,352 KM
        System.out.printf("La distancia entre el IES Fleming y mi casa de Moreda es de %.3f KM", distanciaFlemingMoreda);

        sc.close();
    }
}
