package Unidad4.CreacionClases;

import java.time.LocalDate;

public class Autor {
   private String nombre;
   private String email = null;
   private LocalDate fechaNacimiento = null;

   public Autor (String nombre, String email, LocalDate fechaNacimiento) {
      this.nombre = nombre;
      this.email = email;
      this.fechaNacimiento = fechaNacimiento;
   }

   public String getNombre () {
      return nombre;
   }

   public String getEmail() {
      return email;
   }

   public int getAño () {
      return fechaNacimiento.getYear();
   }

   public void setEmail (String newEmail) {
      this.email = newEmail;
   }

   public String toString () {
      if (this.email == null) {
         return this.nombre + " (" + this.getAño() + ")";
      }
      return this.nombre + " (" + this.getAño() + ") " + this.email;
   }
}
