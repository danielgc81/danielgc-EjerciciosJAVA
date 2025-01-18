package Unidad4.Herencia.Ejercicio02;

public class Electrodomestico {
   private double precioBase = 100;
   private Color color = Color.BLANCO;
   private char consumo = 'F';
   private int peso = 5;
   private double precioFinal;

   public Electrodomestico (int peso) throws Exception {
      this.peso = peso;
      this.precioFinal = calcularPrecioFinal();
   }

   public Electrodomestico (Color color, char consumo, int peso) throws Exception {
      this.color = color;
      this.consumo = consumo;
      this.peso = peso;
      this.precioFinal = calcularPrecioFinal();
   }

   public String getColor() {
      return color.getColor();
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public char getConsumo() {
      return consumo;
   }

   public void setConsumo(char consumo) {
      this.consumo = consumo;
   }

   public int getPeso() {
      return peso;
   }

   public void setPeso(int peso) {
      this.peso = peso;
   }

   public double getPrecioFinal() {
      return precioFinal;
   }

   public void setPrecioFinal(double precioFinal) {
      this.precioFinal = precioFinal;
   }

   public double calcularPrecioFinal () throws Exception{
      if (consumo == 'A') {
         precioFinal = precioBase * 1.3;
      } else if (consumo == 'B') {
         precioFinal = precioBase * 1.25;
      } else if (consumo == 'C') {
         precioFinal = precioBase * 1.2;
      } else if (consumo == 'D') {
         precioFinal = precioBase * 1.15;
      } else if (consumo == 'E') {
         precioFinal = precioBase * 1.1;
      } else if (consumo == 'F') {
         precioFinal = precioBase * 1.05;
      } else {
         throw new Exception("ERROR: El caracter es invalido, introduce una caracter desde la A a la F");
      }

      if (peso > 0 && peso < 20) {
         precioFinal = precioFinal * 1.05;
      } else if (peso >= 20 && peso < 50) {
         precioFinal = precioFinal * 1.1;
      } else if (peso >= 50 && peso < 80) {
         precioFinal = precioFinal * 1.15;
      } else if (peso >= 80) {
         precioFinal = precioFinal * 1.2;
      } else {
         throw new Exception("ERROR: Peso negativo, introduce un valor positivo");
      }

      return precioFinal;
   }

   @Override
   public String toString () {
      return "Electrodomestico [Color " + this.getColor() + ", consumo " + this.consumo + ", peso " + this.peso + "kg , " + this.precioFinal + " euros]";
   }
}
