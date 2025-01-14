package Unidad4.CreacionClases;

import java.util.ArrayList;

public class Entrenador {
   private String nombre;
   private int numeroInsignias;
   private ArrayList<Pokemon> pokedex;

   public Entrenador(String nombre, int numeroInsignias, ArrayList<Pokemon> pokedex) {
      this.nombre = nombre;
      this.numeroInsignias = numeroInsignias;
      this.pokedex = pokedex;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumeroInsignias() {
      return numeroInsignias;
   }

   public void setNumeroInsignias(int numeroInsignias) {
      this.numeroInsignias = numeroInsignias;
   }

   public ArrayList<Pokemon> getPokedex() {
      return pokedex;
   }

   public void setPokedex(ArrayList<Pokemon> pokedex) {
      this.pokedex = pokedex;
   }
}
