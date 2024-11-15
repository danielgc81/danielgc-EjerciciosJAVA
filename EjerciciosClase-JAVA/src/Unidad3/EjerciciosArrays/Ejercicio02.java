package Unidad3.EjerciciosArrays;

import java.util.Random;

public class Ejercicio02 {
   public static void main(String[] args) {
      /*
      Programa que realice las tareas siguientes:
         a) Crear un vector de números enteros de un tamaño aleatorio comprendido entre 10 y 50
            elementos.
         b) Llenar el vector con números aleatorios comprendidos entre -100 y 100 sin repetir ninguno.
         c) Crear un segundo vector que contenga los elementos del anterior almacenados en orden inverso.
         d) Mostrar ambos vectores en la consola.
      */
      Random r = new Random();
      int tamañoArr = r.nextInt(40) + 10;

      // Primer Array
      int[] arr = new int[tamañoArr];
      for (int i = 0; i < arr.length; i++) {
         int nRandom, j;
         do {
            nRandom = r.nextInt(201) - 100;
            j = 0;
            while (j < i && nRandom != arr[j]) {
               j++;
            }
         } while (j < i);
         arr[i] = nRandom;
      }

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      // Segundo Array
      int[] arr2 = new int[arr.length];
      System.out.println();
      for (int i = 0; i < arr2.length; i++) {
         arr2[i] = arr[(tamañoArr - 1) - i];
      }

      for (int i = 0; i < arr2.length; i++) {
         System.out.print(arr2[i] + " ");
      }
   }
}
