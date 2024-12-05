package Unidad3.EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {
   static void intercambioDirecto (int[] v) {
      for (int i = 0; i < v.length; i++) {
         for (int j = v.length - 1; j > i; j--) {
            if (v[j] < v[j - 1]) {
               int aux = v[j];
               v[j] = v[j - 1];
               v[j - 1] = aux;
            }
         }
      }
   }

   public static void main(String[] args) {
      Random r = new Random();

      int[] v1 = new int[r.nextInt(10) + 1];
      int[] v2 = new int[r.nextInt(10) + 1];

      for (int i = 0; i < v1.length; i++) {
         v1[i] = r.nextInt(100);
      }
      for (int i = 0; i < v2.length; i++) {
         v2[i] = r.nextInt(100);
      }

      intercambioDirecto(v1);
      System.out.println(Arrays.toString(v1));
      intercambioDirecto(v2);
      System.out.println(Arrays.toString(v2));

      int[] v3 = new int[v1.length + v2.length];
      for (int i = 0; i < v1.length; i++) {
         v3[i] = v1[i];
      }
      for (int i = 0; i < v2.length; i++) {
         v3[v1.length + i] = v2[i];
      }

      intercambioDirecto(v3);
      System.out.println(Arrays.toString(v3));
   }
}
