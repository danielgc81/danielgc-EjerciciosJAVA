package Unidad4.CreacionClases;

import java.time.LocalDate;

public class PruebaAutor {
   public static void main(String[] args) {
      Autor rowling = new Autor("J.K. Rowling", null, LocalDate.of(1965, 7, 31));
      Autor follet = new Autor("Ken Follet", "folletken@gmail.com", LocalDate.of(1949, 6, 5));

      System.out.println(rowling);
      System.out.println(follet);
   }
}
