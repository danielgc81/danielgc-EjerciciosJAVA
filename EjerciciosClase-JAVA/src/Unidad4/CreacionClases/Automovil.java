package Unidad4.CreacionClases;

public class Automovil {
   private String modelo;
   private int capacidadDeposito;
   private int cantidadCombustible;
   private float consumoPorKm;
   private int kmRecorridos = 0;
   private int combustibleConsumido = 0;

   public Automovil (String modelo, int capacidadDeposito, int cantidadCombustible, float consumoPorKm) {
      this.modelo = modelo;
      this.capacidadDeposito = capacidadDeposito;
      this.cantidadCombustible = cantidadCombustible;
      this.consumoPorKm = consumoPorKm;
   }

   public Automovil (String modelo, int capacidadDeposito, float consumoPorKm) {
      this.modelo = modelo;
      this.capacidadDeposito = capacidadDeposito;
      this.consumoPorKm = consumoPorKm;
      this.cantidadCombustible = capacidadDeposito;
   }

   public String getModelo() {
      return modelo;
   }

   public int getCapacidadDeposito() {
      return capacidadDeposito;
   }

   public int getCantidadCombustible() {
      return cantidadCombustible;
   }

   public float getConsumoPorKm() {
      return consumoPorKm;
   }

   public int getKmRecorridos() {
      return kmRecorridos;
   }

   public int getCombustibleConsumido() {
      return combustibleConsumido;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public void setCapacidadDeposito(int capacidadDeposito) {
      this.capacidadDeposito = capacidadDeposito;
   }

   public void setCantidadCombustible(int cantidadCombustible) {
      this.cantidadCombustible = cantidadCombustible;
   }

   public void setConsumoPorKm(int consumoPorKm) {
      this.consumoPorKm = consumoPorKm;
   }

   public void setKmRecorridos(int kmRecorridos) {
      this.kmRecorridos = kmRecorridos;
   }

   public void setCombustibleConsumido(int combustibleConsumido) {
      this.combustibleConsumido = combustibleConsumido;
   }

   public int llenarDeposito() {
      this.cantidadCombustible = this.capacidadDeposito;
      return this.cantidadCombustible;
   } 

   public int llenarDeposito (int cantidad) {
      int espacioDisponible = this.capacidadDeposito - cantidadCombustible;
      if (cantidad <= espacioDisponible) {
         this.cantidadCombustible += cantidad;
         return 0;
      } else {
         this.cantidadCombustible = this.capacidadDeposito;
         return cantidad - espacioDisponible;
      }
   }

   public String desplazar (int km) {
      if ((km * consumoPorKm) <= this.cantidadCombustible) {
         this.kmRecorridos += km;
         this.combustibleConsumido += km * consumoPorKm;
         this.cantidadCombustible -= km * consumoPorKm;
         return "" + this.modelo + " " + this.cantidadCombustible + " " + this.combustibleConsumido;
      } else {
         return "Combustible insuficiente para este desplazamiento";
      }
   }
}
