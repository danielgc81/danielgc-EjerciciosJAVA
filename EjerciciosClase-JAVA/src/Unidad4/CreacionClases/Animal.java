package Unidad4.CreacionClases;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
   private String nombre;
   private LocalDate fecha;

   public Animal (String nombre) {
      this.nombre = nombre;
      fecha = LocalDate.now();
   }

   public Animal (String nombre, LocalDate fecha) {
      this.nombre = nombre;
      this.fecha = fecha;
   }

   public String getNombre () {
      return nombre;
   }

   public LocalDate getFecha () {
      return fecha;
   }

   public int getEdad () {
      return LocalDate.now().getYear() - this.fecha.getYear();
   }

   public String toString () {
      return "Nombre: " + this.nombre + " - Edad: " + this.getEdad();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Animal animal = (Animal) o;
      return Objects.equals(nombre, animal.nombre) && Objects.equals(fecha, animal.fecha);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nombre, fecha);
   }
}
