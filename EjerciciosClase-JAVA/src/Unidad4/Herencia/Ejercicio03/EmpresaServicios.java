package Unidad4.Herencia.Ejercicio03;

public class EmpresaServicios implements Empresa, Remuneracion{
   String nombre;
   Trabajo tipoServicio;
   int numeroCuenta;

   public EmpresaServicios (String nombre, Trabajo tipoServicio, int numeroCuenta) {
      this.nombre = nombre;
      this.tipoServicio = tipoServicio;
      this.numeroCuenta = numeroCuenta;
   }

   public String getNombre () {
      return nombre;
   }

   public String getTipoServicio () {
      return tipoServicio.getNombreTrabajo();
   }

   public int getNumeroCuenta () {
      return numeroCuenta;
   }

   public void setNumeroCuenta (int numeroCuenta) {
      this.numeroCuenta = numeroCuenta;
   }

   @Override
   public void cobrarServicio (int importe) {
      System.out.println("La empresa de servicios " + this.nombre + " ha recibido " + importe + " euros en su cuenta bancaria " + this.numeroCuenta + " por sus servicios de " + this.getTipoServicio());
   }

   public String toString () {
      return this.nombre + " realiza trabajos de " + this.getTipoServicio();
   }
}
