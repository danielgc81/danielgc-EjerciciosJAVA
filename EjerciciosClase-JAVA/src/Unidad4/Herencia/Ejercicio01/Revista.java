package Unidad4.Herencia.Ejercicio01;

import java.time.LocalDate;

public class Revista extends Publicacion {
   private int numero;
   private int mes;
   private int dia;

   public Revista(int codigo, String titulo, int numero, int año, int mes, int dia) {
      super(codigo, titulo, año);
      this.numero = numero;
      this.mes = mes;
      this.dia = dia;
   }

   public Revista(int codigo, String titulo, int numero) {
      super(codigo, titulo);
      this.mes = LocalDate.now().getMonthValue();
      this.dia = LocalDate.now().getDayOfMonth();
   }

   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public int getMes() {
      return mes;
   }

   public void setMes(int mes) {
      this.mes = mes;
   }

   public int getDia() {
      return dia;
   }

   public void setDia(int dia) {
      this.dia = dia;
   }

   @Override
   public String toString () {
      return "Revista[" + getCodigo() + "," + getTitulo() + "," + this.numero + "," + getAño() + "," + this.mes + "," + this.dia + "]";
   }
}
