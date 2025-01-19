package Unidad4.Herencia.Ejercicio03;

import java.time.LocalDate;

public class Asalariados {
   private String nombre;
   private String apellidos;
   private LocalDate fechaContratacion;
   private int numeroCuentaBancaria;

   public Asalariados (String nombre, String apellidos, LocalDate fechaContratacion, int numeroCuentaBancaria) {
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

   public LocalDate getFechaContratacion() {
      return fechaContratacion;
   }

   public int getNumeroCuentaBancaria() {
      return numeroCuentaBancaria;
   }

   public void setNumeroCuentaBancaria(int numeroCuentaBancaria) {
      this.numeroCuentaBancaria = numeroCuentaBancaria;
   }

   public String toString () {
      return String.format("Asalariado [%s %s, contratado el %s, n Cuenta Bancaria %d]", this.nombre, this.apellidos, this.fechaContratacion.toString(), this.numeroCuentaBancaria);
   }
}
