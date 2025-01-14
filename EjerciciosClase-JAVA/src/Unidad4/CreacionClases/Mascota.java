package Unidad4.CreacionClases;

import java.util.Random;

public class Mascota {
   Random r = new Random();
   private String nombre;
   int energia = 20;
   boolean estaEnfermo = false;

   public Mascota(String nombre) {
      this.nombre = nombre;
      if (this.energia >= 50) {
         this.estaEnfermo = true;
      }
   }

   public void comer () {
      int probabilidadEnfermarse = r.nextInt(11);
      if (estaEnfermo) {
         System.out.println("No puede comer, esta enfermo");
      }

      if (probabilidadEnfermarse < 3) {
         estaEnfermo = true;
      } else {
         this.energia += 5;
      }
   }

   public void dormir () {
      this.energia += 2;
   }

   public void ejercicio () {
      this.energia -= 3;
   }
}
