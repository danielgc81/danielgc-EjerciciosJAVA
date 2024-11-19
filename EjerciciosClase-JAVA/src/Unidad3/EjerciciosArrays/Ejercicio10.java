package Unidad3.EjerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10 {
   /*
   Programa que cree una matriz de números enteros aleatorios con un número de filas y de columnas aleatorios 
   que estén comprendidos entre 2 y 20.
   Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga la
   suma de los valores de cada fila.
   Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga la
   suma de los valores de cada columna.
   Mostrar en la consola la matriz, la suma de cada fila a su derecha y la suma de cada columna debajo de
   ella.
   */

   static int[] sumFilas(int[][] m) {
      int[] v = new int[m.length];
      for (int i = 0; i < m.length; i++) {
         int suma = 0;
         for (int j = 0; j < m[i].length; j++) {
            suma += m[i][j];
         }
         v[i] = suma;
      }
      return v;
   }

   static int[] sumColumnas(int[][] m) {
      int[] v = new int[m[0].length];
      for(int j = 0; j < m[0].length; j++) {
         int sum = 0;
         for(int i = 0;i < m.length; i++) {
            sum += m[i][j];
         }
         v[j] = sum;
      }
      return v;
   }

   static int[][] sumaFilasColumnas(int[][] m) {
      int[][] s = new int[2][];
      s[0] = new int[m.length];
      s[1] = new int[m[0].length];
      for(int i = 0; i < m.length; i++) {
         for(int j = 0;j < m[i].length; j++) {
            s[0][i] += m[i][j];
            s[1][j] += m[i][j];
         }
      }
      return s;
   }

   public static void main(String[] args) {
      Random r = new Random();
      int filas = r.nextInt(19) +2;
      int columnas = r.nextInt(19) + 2;
      int[][] m = new int[filas][columnas];

      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            m[i][j] = r.nextInt(7);
            System.out.print(m[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println("Suma de las filas: " + Arrays.toString(sumFilas(m)));
      System.out.println("Suma de las columnas: " + Arrays.toString(sumColumnas(m)));
   }
}
