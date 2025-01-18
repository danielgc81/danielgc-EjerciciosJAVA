package Unidad4.Herencia.Ejercicio02;

public class Television extends Electrodomestico {
   private double precioFinal;
   private int pulgadas = 20;
   private String sintonizador = "DVB-T";

   public Television (int peso) throws Exception {
      super(peso);
      this.precioFinal = calcularPrecioFinal();
   }

   public Television (Color color, char consumo, int peso, int pulgadas, String sintonizador)  throws Exception {
      super(color, consumo, peso);
      this.pulgadas = pulgadas;
      this.precioFinal = calcularPrecioFinal();
      if (validarSintonizador(sintonizador)) {
         this.sintonizador = sintonizador;
      } else {
         throw new Exception("El formato del sintonizador no es válido");
      }
   }

   public boolean validarSintonizador (String sintonizador) {
      if (sintonizador.equals("DVB-T") || sintonizador.equals("DVB-T2")) {
         return true;
      }
      return false;
   }

   public int getPulgadas () {
      return pulgadas;
   }

   public void setPulgadas (int pulgadas) {
      this.pulgadas = pulgadas;
   }

   public String getSintonizador () {
      return sintonizador;
   }

   public void setSintonizador (String sintonizador) throws Exception {
      if (validarSintonizador(sintonizador)) {
         this.sintonizador = sintonizador;
      } else {
         throw new Exception("El formato del sintonizador no es válido");
      }
   }

   @Override
   public double getPrecioFinal () {
      return precioFinal;
   }

   public String toString () {
      return "Television [Color " + this.getColor() + ", consumo " + this.getConsumo() + ", peso " + this.getPeso() + "kg , " + this.pulgadas + " pulgadas , sintonizador " + this.sintonizador + " , " + this.getPrecioFinal() + " euros]";
   }
}
