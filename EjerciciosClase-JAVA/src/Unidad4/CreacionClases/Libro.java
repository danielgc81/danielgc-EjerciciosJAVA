package Unidad4.CreacionClases;

import java.util.ArrayList;

public class Libro {
   private String titulo;
   private ArrayList<Autor> autores = new ArrayList<>();
   private double precio;
   private int stock;

   public Libro (String titulo, ArrayList<Autor> autores, double precio, int stock) {
      this.titulo = titulo;
      this.autores = autores;
      this.precio = precio;
      this.stock = stock;
   }

   public Libro (String titulo, ArrayList<Autor> autores, double precio) {
      this.titulo = titulo;
      this.autores = autores;
      this.precio = precio;
      this.stock = 1;
   }

   public String getTitulo() {
      return titulo;
   }

   public ArrayList<Autor> getAutores() {
      return autores;
   }

   public double getPrecio() {
      return precio;
   }

   public int getStock() {
      return stock;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public void setAutores(ArrayList<Autor> autores) {
      this.autores = autores;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }

   public String toString () {
      return this.titulo + " (" + this.autores + ") " + this.precio + "€ - " + this.stock + " unidades en stock";
   }
}
