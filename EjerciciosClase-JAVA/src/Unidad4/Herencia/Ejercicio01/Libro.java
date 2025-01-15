package Unidad4.Herencia.Ejercicio01;

import java.util.ArrayList;
import java.util.Objects;

public class Libro extends Publicacion implements Prestable{
   private ArrayList<String> autores;
   private boolean estaPrestado;

   public Libro(int codigo, String titulo, int año, String... autores) {
      super(codigo, titulo, año);
      this.estaPrestado = false;
   }
   
   public Libro(int codigo, String titulo, String... autores) {
      super(codigo, titulo);
      this.estaPrestado = false;
   }

   public ArrayList<String> getAutores() {
      return autores;
   }

   public void setAutores(ArrayList<String> autores) {
      this.autores = autores;
   }

   public boolean isPrestado () {
      return estaPrestado;
   }

   public void setEstaPrestado (boolean estaPrestado) {
      this.estaPrestado = estaPrestado;
   }

   public void prestar () {
      if (!estaPrestado) {
         System.out.println("Libro Prestado");
         this.estaPrestado = true;
      } else {
         System.out.println("El libro ya esta prestado");
      }
   }

   public void devolver () {
      if (estaPrestado) {
         System.out.println("Libro devuelto");
         this.estaPrestado = false;
      } else {
         System.out.println("El libro no esta prestado");
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Libro libro = (Libro) o;
      return Objects.equals(autores, libro.autores);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), autores);
   }

   @Override
   public String toString () {
      return "Libro [" + getCodigo() + "," + getTitulo() + "," + getAño() + "," + getAutores() + "]";
   }
}
