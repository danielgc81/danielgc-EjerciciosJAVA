package Unidad4.CreacionClases;

import java.time.LocalDate;

public class PruebaAnimal {
   public static void main(String[] args) {
      Animal animal = new Animal("Pepe");
      Animal animal2 = new Animal("Ñu", LocalDate.of(2012, 11, 04));
      System.out.println(animal);
      System.out.println(animal2);
      System.out.println(animal2.getEdad());
   }
}
