package Unidad4.CreacionClases;

public class Naipe {
   public enum Palo {
      TREBOLES, DIAMANTES, CORAZONES, PICAS;
   }

   public enum Rango {
      DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(11), Q(12), K(13), A(14);   
      private int valor;

      Rango (int valor) {
         this.valor = valor;
      }

      public int getValor() {
         return valor;
      }
   }

   private Palo palo;
   private Rango rango;

   public Naipe (Palo palo, Rango rango) {
      this.palo = palo;
      this.rango = rango;
   }

   public Palo getPalo() {
      return palo;
   }

   public void setPalo(Palo palo) {
      this.palo = palo;
   }

   public Rango getRango() {
      return rango;
   }

   public void setRango(Rango rango) {
      this.rango = rango;
   }

   public String toString () {
      return this.rango + " de " + this.palo;
   }
}
