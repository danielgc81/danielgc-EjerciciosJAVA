package Unidad4.Herencia.Ejercicio02;

public class Frigorifico extends Electrodomestico {
   private double precioFinal;
   private boolean noFrost = false;

   public Frigorifico (int peso) throws Exception {
      super(peso);
      this.precioFinal = calcularPrecioFinal();
   }

   public Frigorifico (Color color, char consumo, int peso, boolean noFrost) throws Exception {
      super(color, consumo, peso);
      this.noFrost = noFrost;
      this.precioFinal = calcularPrecioFinal();
   }

   public boolean getNoFrost () {
      return noFrost;
   }

   public void setNoFrost (boolean noFrost) {
      this.noFrost = noFrost;
   }

   @Override
   public double getPrecioFinal () {
      return precioFinal;
   }

   public String toString () {
      return "Frigorifico [Color " + this.getColor() + ", consumo " + this.getConsumo() + ", peso " + this.getPeso() + "kg , " + (this.noFrost ? "no tiene capacidad No Frost, " : "tiene capacidad No Frost, ") + this.getPrecioFinal() + " euros]";
   }
}
