package Unidad4.Herencia.Ejercicio01;

import java.util.Arrays;

public class PruebaPublicacion {
   public static void main(String[] args) {
      Libro l1 = new Libro(2142, "Harry Potter", "JK Rowling");
      Libro l2 = new Libro(28913, "Los Pilares de la Tierra", "Ken Follet");
      Libro l3 = new Libro(23432, "Los Futbolisimos", "Lionel Messi", "Cristiano Ronaldo", "Neymar Jr");
      Revista r1 = new Revista(21323, "Vogue", 3, 2025, 1, 16);

      Publicacion[] publicaciones = {l1, r1, l2, l3};
      System.out.println(Arrays.toString(publicaciones));
      Arrays.sort(publicaciones);
      System.out.println(Arrays.toString(publicaciones));
   }
}
