package Unidad3.EjerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
   public static void main(String[] args) {
      /*
      Programa que realice las tareas siguientes:
         a) Crear un vector de números enteros de un tamaño comprendido entre 10 y 1.000.000 que el
            usuario introducirá por teclado.
         b) Llenar el vector con números aleatorios sin que se repita ninguno. El valor de cada número estará
            comprendido entre -(tamaño * 2000) y (tamaño * 2000).
         c) Después de que se haya llenado el vector, calcular la diferencia entre el menor y el mayor de los
            valores almacenados.
         d) Mostrar en la consola los datos siguientes:
               o Tamaño del vector.
               o Tiempo empleado en llenarlo.
               o El valor calculado en el paso c.
               o Tiempo empleado en obtener el valor calculado en el paso c.
      */

      Random r = new Random();
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce el tamaño del vector (entre 10 y 1000000)");
      int tamañoArr = sc.nextInt();

      while (tamañoArr < 10 || tamañoArr > 1000000 ) {
         System.out.println("El tamaño del vector debe ser entre 10 y 1000000");
         System.out.println("Introduce el tamaño del vector (entre 10 y 1000000)");
         tamañoArr = sc.nextInt();
      }

      int[] arr = new int[tamañoArr];
      System.out.printf("El tamaño del vector es de %d elementos\n", arr.length); // Mostrar en consola

      double tiempoInicial = System.currentTimeMillis();
      for (int i = 0; i < arr.length; i++) {
         int nRandom = r.nextInt(4001) - 2000;
         arr[i] = nRandom;
      }
      double tiempoFinal = System.currentTimeMillis();

      double tiempoTotal = tiempoFinal - tiempoInicial;
      double segundos = tiempoTotal / 1000.0;

      System.out.printf("Se ha tardado %.3f segundos en rellenar el vector\n", segundos); // Mostrar en consola

      double tiempoInicial2 = System.currentTimeMillis();
      int numMin = 2000;
      int numMax = -2000;
      
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] < numMin) {
            numMin = arr[i];
         }
      }

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > numMax) {
            numMax = arr[i];
         }
      }
      
      int diferencia = numMax - numMin;
      System.out.println("La diferencia entre el numero mas grande y mas pequeño es " + diferencia); // Mostrar en consola
      double tiempoFinal2 = System.currentTimeMillis();

      double tiempoTotal2 = tiempoFinal2 - tiempoInicial2;
      double segundos2 = tiempoTotal2 / 1000.0;
      System.out.printf("Se ha tardado %.3f segundos en obtener el valor de la diiferencia entre el numMax y el numMin\n", segundos2); // Mostrar en consola

      sc.close();
   }
}
