package Unidad3.EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
   public static void main(String[] args) {
      /*
         6. Programa que realice las tareas siguientes:
         a) Crear un vector de números enteros de un tamaño aleatorio entre 10 y 500 elementos.
         b) Llenar el vector con números aleatorios comprendidos entre -100 y 100.
         c) Mostrar el contenido del vector si su tamaño es menor o igual a 50.
         d) Mostrar el número de secuencias de valores repetidos.
      */

      Random r = new Random();
      int[] v = new int[r.nextInt(491) + 10];

      for (int i = 0; i < v.length; i++) {
         v[i] = r.nextInt(201) - 100;
      }

      if (v.length <= 50) {
         System.out.println(Arrays.toString(v));
      }

      int secuenciasRepetidas = 0;

      for (int i = 1; i < v.length - 1; i++) {
         if (v[i] == v[i - 1]) {
            secuenciasRepetidas++;
         }
      }

      System.out.printf("Hay un total de %d " + (secuenciasRepetidas == 1 ? "secuencia repetida" : "secuencias repetidas"), secuenciasRepetidas);
   }
}
