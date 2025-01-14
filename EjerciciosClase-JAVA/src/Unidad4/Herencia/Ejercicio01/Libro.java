package Unidad4.Herencia.Ejercicio01;

import java.util.ArrayList;

public class Libro extends Publicacion{
   private ArrayList<String> autores;

   public Libro(int codigo, String titulo, int año, String... autores) {
      super(codigo, titulo, año);
   }
   
   public Libro(int codigo, String titulo, String... autores) {
      super(codigo, titulo);
   }
}
