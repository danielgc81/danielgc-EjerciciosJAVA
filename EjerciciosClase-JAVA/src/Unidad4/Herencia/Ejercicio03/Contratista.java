package Unidad4.Herencia.Ejercicio03;

import java.time.LocalDate;

public class Contratista implements Empleado{
   private String nombre;
   private String apellidos;
   private LocalDate fechaContratacion;
   private int numeroCuentaBancaria;
   private SociedadAnonima sociedadAnonima;

   public Contratista (String nombre, String apellidos, LocalDate fechaContratacion, int numeroCuentaBancaria, SociedadAnonima sociedadAnonima) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.fechaContratacion = fechaContratacion;
      this.numeroCuentaBancaria = numeroCuentaBancaria;
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

   public int getNumeroCuentaBancaria() {
      return numeroCuentaBancaria;
   }

   public void setNumeroCuentaBancaria(int numeroCuentaBancaria) {
      this.numeroCuentaBancaria = numeroCuentaBancaria;
   }

   public String toString () {
      return String.format("Contratista [%s %s, contratado el %s, n Cuenta Bancaria %d, %s]", this.nombre, this.apellidos, this.getFechaContratacion(), this.numeroCuentaBancaria, (sociedadAnonima != null ? "tiene una S.A. llamada " + sociedadAnonima.getNombre() : "no tiene ninguna S.A"));
   }
}
