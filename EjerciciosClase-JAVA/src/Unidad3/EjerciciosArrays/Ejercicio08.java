package Unidad3.EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio08 {
   /*
      Definir un método que reciba un vector de cadenas y retorne la de mayor longitud. Poner a prueba el
      método invocándolo desde el método main con un vector que almacene los nombres de 10 personas
      introducidos por teclado.
   */

   public static String stringMayorLongitud(String[] v) {
      int max = Integer.MIN_VALUE;
      String str = " ";

      for (int i = 0; i < v.length; i++) {
         if (v[i].length() > max ) {
            max = v[i].length();
            str = v[i];
         }
      }

      return str;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] v = new String[10];

      System.out.println("Introduce 10 nombres de personas: ");
      for (int i = 0; i < v.length; i++) {
         v[i] = sc.next();
      }

      System.out.println("El nombre más largo es " + stringMayorLongitud(v));

      sc.close();
   }
}
