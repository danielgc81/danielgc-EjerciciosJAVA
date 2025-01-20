package Unidad4.Herencia.Ejercicio03;

import java.time.LocalDate;

public class Contratista implements Empleado,Remuneracion {
   private String nombre;
   private String apellidos;
   private LocalDate fechaContratacion;
   private int numeroCuenta;
   private SociedadAnonima sociedadAnonima;

   public Contratista (String nombre, String apellidos, LocalDate fechaContratacion, int numeroCuenta, SociedadAnonima sociedadAnonima) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.fechaContratacion = fechaContratacion;
      this.numeroCuenta = numeroCuenta;
      this.sociedadAnonima = sociedadAnonima;
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
      System.out.println("El empleado contratista " + this.nombre + " ha recibido " + importe + " euros en su cuenta bancaria " + this.numeroCuenta + " por sus servicios");
   }

   public String toString () {
      return String.format("Contratista [%s %s, contratado el %s, n Cuenta Bancaria %d, %s]", this.nombre, this.apellidos, this.getFechaContratacion(), this.numeroCuenta, (sociedadAnonima != null ? "tiene una S.A. llamada " + sociedadAnonima.getNombre() : "no tiene ninguna S.A"));
   }
}
