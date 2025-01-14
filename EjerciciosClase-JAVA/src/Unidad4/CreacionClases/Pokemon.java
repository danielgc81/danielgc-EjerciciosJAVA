package Unidad4.CreacionClases;

public class Pokemon {
   private String nombre;
   private int puntosVida;

   enum tipoPokemon {
      AGUA, FUEGO, PLANTA, ELECTRICO, TIERRA, VOLADOR, ROCA, HIELO, DRAGON, FANTASMA, LUCHA, PSÍQUICO, VENENO, BICHO, ACERO;
   }

   private tipoPokemon tipo;

   public Pokemon (String nombre, int puntosVida, tipoPokemon tipo) {
      this.nombre = nombre;
      this.puntosVida = puntosVida;
      this.tipo = tipo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getPuntosVida() {
      return puntosVida;
   }

   public void setPuntosVida(int puntosVida) {
      this.puntosVida = puntosVida;
   }

   public tipoPokemon getTipo() {
      return tipo;
   }

   public void setTipo(tipoPokemon tipo) {
      this.tipo = tipo;
   }
}
