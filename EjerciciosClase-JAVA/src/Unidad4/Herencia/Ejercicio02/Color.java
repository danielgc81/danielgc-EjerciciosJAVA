package Unidad4.Herencia.Ejercicio02;

public enum Color {
   BLANCO("blanco"), NEGRO("negro"), ROJO("rojo"), AZUL("azul"), GRIS("gris");

   private String color;

   Color (String color) {
      this.color = color;
   }

   public String getColor () {
      return color;
   };
}
