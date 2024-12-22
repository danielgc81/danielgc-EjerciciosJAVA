package Unidad4.CreacionClases;

import java.time.LocalDate;
import java.util.ArrayList;

public class PruebaLibro {
   public static void main(String[] args) {
      Autor rowling = new Autor("J.K. Rowling", null, LocalDate.of(1965, 7, 31));
      ArrayList<Autor> autores = new ArrayList<>();
      autores.add(rowling);
      Libro harrypotter = new Libro("Harry Potter y la piedra filosofal", autores, 20.5, 10);
      System.out.println(harrypotter);
   }
}
