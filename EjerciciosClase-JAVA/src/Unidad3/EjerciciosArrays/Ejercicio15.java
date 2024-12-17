package Unidad3.EjerciciosArrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

   public static int[][] cuadrada1(int n) {
      int[][] m = new int[n][n];
      int num = 1;
      for (int j = 0; j < m[0].length; j++) {
         for (int i = 0; i < m.length; i++) {
            m[i][j] = num;
            num++;
         }
      }
      return m;
   }

   public static int[][] cuadrada2 (int n) {
      int[][] m = new int[n][n];
      int num = 1;
      for (int j = 0; j < m[0].length; j++) {
         if (j % 2 == 0) {
            for (int i = 0; i < m.length; i++) {
               m[i][j] = num;
               num++;
            }
         } else {
            for (int i = n - 1; i >= 0; i--) {
               m[i][j] = num;
               num++;
            }
         }
      }
      return m;
   }

   public static String[][] palindromos(int f, int c) {
      if (f < 1 || f > 26 || c < 1 || c > 26) {
         return null;
      }
      String[][] m = new String[f][c];
      for (int i = 0; i < f; i++) {
         for (int j = 0; j < c; j++) {
            char primeraTerceraLetra = (char) ('a' + i);
            char segundaLetra = (char) ('a' + (i + j) % 26);
            m[i][j] = "" + primeraTerceraLetra + segundaLetra + primeraTerceraLetra;
         }
      }
      return m;
   }

   public static void main(String[] args) {
      /*
         Crea una clase Matrices que defina los siguientes métodos de clase:

         static int [][] cuadrada1(int n)
         Crea y retorna una matriz cuadrada de números enteros de dimensión nxn. Antes de retornarla, la
         rellenará con valores consecutivos, comenzando en 1, en el orden que se indica en el ejemplo siguiente
         con una matriz cuadrada de 4x4:
               1 5 9 13
               2 6 10 14
               3 7 11 15
               4 8 12 16

         static int [][] cuadrada2(int n)
         Crea y retorna una matriz cuadrada de números enteros de dimensión nxn. Antes de retornarla, la
         rellenará con valores consecutivos, comenzando en 1, en el orden que se indica en el ejemplo siguiente
         con una matriz cuadrada de 4x4:
               1 8 9 16
               2 7 10 15
               3 6 11 14
               4 5 12 13

         static String [][] palindromos(int c, int f)
         Crea una matriz de f filas y c columnas y la rellena con palíndromos de tres letras que se generan de la
         forma siguiente:
            • La primera y tercera letra del palíndromo están determinadas el número de fila en la que se va
            a almacenar:
            fila 0 → letra ‘a’, fila 1 → letra ‘b’, fila 0 → letra ‘c’, …
            • La segunda letra del palíndromo está determinada por el valor de la suma fila+columna:
            fil+col=0 → letra ‘a’, fil+col=1 → letra ‘b’, fil+col=2 → letra ‘c’, …
         Una vez creada y rellenada, retornará la matriz.
         El número de filas y de columnas tiene que estar comprendido entre 1 y 26. De no ser así, el método
         retornará el valor null.
         (ejemplo para una matriz de 4x6)
               aaa aba aca ada aea afa
               bbb bcb bdb beb bfb bgb
               ccc cdc cec cfc cgc chc
               ddd ded dfd dgd dhd did
         
         static int max3x3sum(int [][] matriz)
         Recibe una matriz de NxM y retorna el valor máximo de todos los resultados que se obtienen sumando
         los elementos de cada matriz de 3x3 contenida en ella.
         El valor de N y M deber de ser mayor o igual que 3.
         (ejemplo para una matriz de dimensión 4x5)
               1 5 5 2 4
               2 1 4 14 3
               = 75
               3 7 11 2 8
               4 8 12 16 4
         
         Pon a prueba los métodos anteriores invocándolos desde el método main de otra clase llamada
         PruebaMatrices.
      */

      Random r = new Random();

      int[][] m = cuadrada1(r.nextInt(9) + 1);
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            System.out.printf("%3d ",m[i][j]);
         }
         System.out.println();
      }

      System.out.println();

      int[][] m2 = cuadrada2(r.nextInt(9) + 1);
      for (int i = 0; i < m2.length; i++) {
         for (int j = 0; j < m2[i].length; j++) {
            System.out.printf("%3d ",m2[i][j]);
         }
         System.out.println();
      }

      System.out.println();

      Scanner sc = new Scanner(System.in);

      System.out.println("Filas: ");
      int f = sc.nextInt();
      System.out.println("Columnas: ");
      int c = sc.nextInt();

      String[][] m3 = palindromos(f,c);
      for (int i = 0; i < f; i++) {
         for (int j = 0; j < c; j++) {
            System.out.printf("%4s",m3[i][j]);
         }
         System.out.println();
      }

      sc.close();
   }
}
