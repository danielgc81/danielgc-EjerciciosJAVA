package Unidad3.EjerciciosArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
   /*
      Crea una clase que defina los siguientes métodos de clase:
         a) Método que acepte un vector de números enteros y retorne el valor máximo almacenado en
         él.
         b) Método que acepte un vector de números enteros y retorne la media exacta de todos los
         valores almacenados en él.
         c) Método que acepte dos parámetros, un vector de cadenas y una cadena individual, y retorne
         en cuántas de las cadenas almacenadas en el vector está contenida la cadena individual.
         d) Método que reciba dos vectores de cadenas y retorne true si ambos son iguales, es decir,
         contienen el mismo número de cadenas y las que se encuentran en la misma posición en
         ambos vectores son iguales.
         e) Método que acepte un vector de cadenas e intercambie lo que hay en la posición 0 con lo que
         hay en la posición 1, lo que hay en la 2 con lo que hay en la 3, etc. Si el array contiene un
         número impar de cadenas, la última no se intercambia.
         f) Método que acepte un vector de números enteros y retorne el rango de valores almacenados,
         entendiendo por rango la diferencia entre el valor mayor y el valor menor más 1.
         g) Método que acepte un vector de números enteros y retorne la desviación estándar de los
         valores almacenados en un array de números enteros. Este valor se computa a partir de la
         siguiente expresión matemática:
            𝑆 = √∑ (𝑣[𝑖] − 𝑣̅)𝑛
            𝑖=0
            𝑛 − 1
            𝐷𝑜𝑛𝑑𝑒 𝑣 𝑒𝑠 𝑒𝑙 𝑣𝑒𝑐𝑡𝑜𝑟, 𝑛 𝑠𝑢 𝑡𝑎𝑚𝑎ñ𝑜 𝑦 𝑣̅ 𝑙𝑎 𝑚𝑒𝑑𝑖𝑎 𝑑𝑒 𝑙𝑜𝑠 𝑣𝑎𝑙𝑜𝑟𝑒𝑠 𝑎𝑙𝑚𝑎𝑐𝑒𝑛𝑎𝑑𝑜𝑠.
         h) Método que reciba un vector de números enteros y retorne la mínima diferencia entre dos
         valores adyacentes.
         i) Método que reciba un vector de números enteros y retorne otro vector que almacene el
         resultado de sumar cada par de valores almacenados en el primero (el primero con el segundo,
         el tercero con el cuarto, etc). Si el vector tiene un número impar de elementos, el último se
         almacenará en el vector resultado sin sumarlo con ningún otro.
         j) Método que reciba dos vectores de números enteros y retorne un nuevo array que resulte de
         la concatenación de los dos primeros.
         k) Método que reciba un vector de números enteros y retorne la longitud de la subsecuencia más
         larga de valores ordenados de menor a mayor. Ejemplo:
         {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21} → 4
      Añade un método main para poner a prueba todos los métodos anteriores.
   */

   // a
   public static int numeroMax(int[] v) {
      int numMax = Integer.MIN_VALUE;
      for (int i = 0; i < v.length; i++) {
         if (v[i] > numMax) {
            numMax = v[i];
         }
      }
      return numMax;
   }

   // b
   public static double numsMedia(int[] v) {
      double contador = 0;
      for (int i = 0; i < v.length; i++) {
         contador += v[i];
      }
      return contador / v.length;
   }

   // c
   public static int contarOcurrencias(String[] v, String s) {
      int contador = 0;
      for (String sub : v) {
         if (s.contains(sub)) {
            contador++;
         } 
      }
      return contador;
   }

   // e
   public static int[] intercambiar(int[] v) {
      for (int i = 0; i < v.length - 1; i++) {
         int aux = v[i];
         v[i] = v[i + 1];
         v[i + 1] = aux;
      }
      return v;
   }

   // f
   public static int rango(int[] v) {
      int numMax = Integer.MIN_VALUE;
      int numMin = Integer.MAX_VALUE;
      for (int i : v) {
         if (i > numMax) {
            numMax = i;
         } 
         if (i < numMin) {
            numMin = i;
         }
      }
      return numMax - numMin + 1;
   }

   // g
   public static double desviacionEstandar(int[] v) {
      double aux = 0;
      for (int i = 0; i < v.length; i++) {
         aux += v[i];
      }
      aux = aux / v.length;
      double aux2 = 0;
      for (int j = 0; j < v.length; j++) {
         aux += v[j] - aux;
      }
      aux2 = aux2 / (v.length - 1);
      return aux2;
   }

   // h
   public static int diferenciaMinimaVA(int[] v) {
      int min = Integer.MAX_VALUE;
      int aux;
      for (int i = 0; i < v.length - 1; i++) {
         aux = v[i] - v[i + 1];
         if ( aux < min) {
            min = aux;
         }
      }
      return min;
   }

   // i
   public static ArrayList<Integer> sumaPares(int[] v) {
      ArrayList<Integer> suma = new ArrayList<Integer>();
      for (int i = 0; i < v.length; i += 2) {
         suma.add((v.length - 1) == i ? v[i] : v[i] + v[i + 1]);
      }
      return suma;
   }

   // j
   public static int[] concatenarArrays(int[] v, int[] x) {
      int[] arr = new int[v.length + x.length];
      for (int i = 0; i < v.length; i++) {
         arr[i] = v[i];
      }
      for (int i = 0; i < x.length; i++) {
         arr[v.length + i] = x[i]; 
      }
      return arr;
   }

   // k
   public static int longitud(int[] v) {
      int max = 0;
      if (v != null && v.length > 0) {
         max++;
         int contador = 1;
         for (int i = 1; i < v.length; i++) {
            if (v[i] > v[i - 1]){
               contador++;
            } else {
               if (contador > max) {
                  max = contador;
               }
               contador = 1;
            }
         }
      }
      return max;
   }

   public static void main(String[] args) {
      Random r = new Random();

      int[] v = new int[6];
      int[] v2 = {1,2,3,4,5};
      int[] v3 = {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21};
      for (int i = 0; i < v.length; i++) {
         v[i] = r.nextInt(20);
      }

      String[] vString = {"arr", "array", "dani", "array"};
      String[] vString2 = {"arr", "array", "dani", "array"};
      
      System.out.println(Arrays.toString(v));
      System.out.println(Arrays.toString(v3));
      System.out.println("Arrays concatenados: " + Arrays.toString(concatenarArrays(v, v2)));
      System.out.printf("El numero mas grande del vector es %d\n", numeroMax(v));
      System.out.printf("La media de todos los numeros almacenados es %.2f\n", numsMedia(v));
      System.out.printf("La cadena esta contenida %d veces en el array\n", contarOcurrencias(vString, "array"));
      // d
      if (Arrays.equals(vString2, vString)) {
         System.out.println("Los arrays son iguales");
      } else {
         System.out.println("Los arrays no son iguales");
      }
      System.out.println(Arrays.toString(intercambiar(v2)));
      System.out.printf("El rango del array es %d\n",rango(v));
      System.out.println("Desviacion estandar: " + desviacionEstandar(v));
      System.out.println("Diferencia minima entre valores adyacentes: " + diferenciaMinimaVA(v));
      System.out.println("Suma pares: " + sumaPares(v));
      System.out.println("Longitud de la subsecuencia más larga de valores ordenados de menor a mayor: " + longitud(v3));
   }
}