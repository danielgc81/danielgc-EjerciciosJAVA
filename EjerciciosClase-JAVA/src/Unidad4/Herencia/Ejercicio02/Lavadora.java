package Unidad4.Herencia.Ejercicio02;

public class Lavadora extends Electrodomestico {
   private int carga = 5;
   private double precioFinal;

   public Lavadora (int peso) throws Exception {
      super(peso);
      this.precioFinal = calcularPrecioFinal();
   }

   public Lavadora (Color color, char consumo, int peso, int carga) throws Exception {
      super(color, consumo, peso);
      this.carga = carga;
      this.precioFinal = calcularPrecioFinal();
      if (this.carga >= 8) {
         this.precioFinal = precioFinal * 1.1;
      }
   }

   public int getCarga () {
      return carga;
   }

   public void setCarga (int carga) {
      this.carga = carga;
   }

   @Override
   public double getPrecioFinal () {
      return precioFinal;
   }

   public String toString () {
      return "Lavadora [Color " + this.getColor() + ", consumo " + this.getConsumo() + ", peso " + this.getPeso() + "kg , carga " + this.carga + "kg , " + this.getPrecioFinal() + " euros]";
   }
}
