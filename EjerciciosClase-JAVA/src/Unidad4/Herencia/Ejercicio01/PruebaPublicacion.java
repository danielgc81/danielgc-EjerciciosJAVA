package Unidad4.Herencia.Ejercicio01;

import java.util.ArrayList;

public class PruebaPublicacion {
   public static void main(String[] args) {
      ArrayList<Prestable> publicacions = new ArrayList<>();

      publicacions.add(new Libro(2142, "Harry Potter", "JK Rowling"));
      publicacions.add(new Libro(28913, "Los Pilares de la Tierra", "Ken Follet"));

      Prestable p = publicacions.getFirst();
      System.out.println(p);
   }
}
