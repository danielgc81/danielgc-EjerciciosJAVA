package Unidad4.Herencia.Ejercicio03;

import java.time.LocalDate;

public class Asalariados implements Empleado,Remuneracion {
   private String nombre;
   private String apellidos;
   private LocalDate fechaContratacion;
   private int numeroCuenta;

   public Asalariados (String nombre, String apellidos, LocalDate fechaContratacion, int numeroCuenta) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.fechaContratacion = fechaContratacion;
      this.numeroCuenta = numeroCuenta;
   }

   public String getNombre() {
      return nombre;
   }

   public String getApellidos() {
      return apellidos;
   }

   public String getFechaContratacion() {
      return fechaContratacion.toString();
   }

   public int getNumeroCuenta() {
      return numeroCuenta;
   }

   public void setNumeroCuenta(int numeroCuenta) {
      this.numeroCuenta = numeroCuenta;
   }

   @Override
   public void cobrarServicio (int importe) {
      System.out.println("El empleado asalariado " + this.nombre + " ha recibido " + importe + " euros en su cuenta bancaria " + this.numeroCuenta + " por sus servicios");
   }

   public String toString () {
      return String.format("Asalariado [%s %s, contratado el %s, n Cuenta Bancaria %d]", this.nombre, this.apellidos, this.getFechaContratacion(), this.numeroCuenta);
   }
}
