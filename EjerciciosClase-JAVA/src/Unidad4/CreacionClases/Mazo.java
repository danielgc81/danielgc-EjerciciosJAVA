package Unidad4.CreacionClases;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
   private ArrayList<Naipe> baraja = new ArrayList<>();
   Random r = new Random();

   public Mazo () {
      for (Naipe.Palo palo : Naipe.Palo.values()) {
         for (Naipe.Rango rango : Naipe.Rango.values()) {
            baraja.add(new Naipe(palo, rango));
         }
      }
   }

   public Mazo(ArrayList<Naipe> baraja) {
      this.baraja = baraja;
   }

   public ArrayList<Naipe> getBaraja() {
      return baraja;
   }

   public Naipe getNaipe (int naipe) {
      return baraja.get(naipe);
   }

   public Naipe retirar () {
      Random r = new Random();
      int naipeAleatorio = r.nextInt(baraja.size());
      Naipe naipe = baraja.get(naipeAleatorio);
      baraja.remove(naipeAleatorio);
      return naipe;
   }

   public Naipe agregar (Naipe.Palo palo, Naipe.Rango rango) {
      Naipe naipe = new Naipe(palo, rango);
      baraja.add(naipe);
      return naipe;
   }

   public void agregarTodos (Mazo otroMazo) {
      for (Naipe naipe : otroMazo.baraja) {
         this.baraja.add(naipe);
      }
      otroMazo.baraja.clear();
   }

   public void barajar () {
      ArrayList<Naipe> barajaBarajada = new ArrayList<>();
      while (baraja.size() > 0) {
         int naipeAleatorio = r.nextInt(baraja.size());
         barajaBarajada.add(baraja.get(naipeAleatorio));
         baraja.remove(naipeAleatorio);
      }
      baraja = barajaBarajada;
   }
}
