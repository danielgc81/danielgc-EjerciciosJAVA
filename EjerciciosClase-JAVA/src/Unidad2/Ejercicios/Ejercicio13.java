package Unidad2.Ejercicios;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Escribe un programa que genere mil millones de números aleatorios de tipo long y muestre cuántos
        // pertenecen al intervalo [-1.000.000.000.000.000.000, 1.000.000.000.000.000.000] y del tiempo
        // empleado en obtener dicho resultado

        Random r = new Random();
        long numRandom;
        int contador = 0;
        long t0 = System.currentTimeMillis();
        for (long i = 0; i <= 1000000000L; i++){
            numRandom = r.nextInt();

            if (numRandom <= 1000000000000000000L && numRandom >= -1000000000000000000L) {
                contador++;
            }
        }
        long t1 = System.currentTimeMillis();
        long tiempoEmpleado = (t1 - t0) / 1000;

        System.out.println("Se han encontrado " + contador + " números");
        System.out.println("Tiempo empleado " + tiempoEmpleado + " segundos");
    }
}
