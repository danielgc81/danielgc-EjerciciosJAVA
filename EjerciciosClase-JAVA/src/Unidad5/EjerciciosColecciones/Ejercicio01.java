package Unidad5.EjerciciosColecciones;

import java.util.Scanner;
import java.util.LinkedList;

public class Ejercicio01 {
   public static void main(String[] args) {
      LinkedList<String> lista = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String nombre = sc.next();
         if (!lista.contains(nombre)) {
            lista.add(nombre);
         }
      }
      sc.close();

      for (String nombre : lista) {
         System.out.println(nombre);
      }
   }
}
