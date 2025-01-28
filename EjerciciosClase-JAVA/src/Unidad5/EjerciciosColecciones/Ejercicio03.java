package Unidad5.EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<String> listaRepetidos = new ArrayList<>();
      ArrayList<String> listaNoRepetidos = new ArrayList<>();

      while (sc.hasNext()) {
         String linea = sc.next();
         if (listaNoRepetidos.contains(linea)) {
            listaNoRepetidos.remove(linea);
            listaRepetidos.add(linea);
         } else if (!listaNoRepetidos.contains(linea)) {
            listaNoRepetidos.add(linea);
         }
      }

      System.out.println("Lista Repetidos: " + listaRepetidos);
      System.out.println("Lista No Repetidos: " + listaNoRepetidos);
      sc.close();
   }
}
