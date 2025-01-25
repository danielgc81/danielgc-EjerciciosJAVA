package Unidad4.Herencia.Ejercicio01;

import java.time.LocalDate;
import java.util.Objects;

public class Publicacion implements Comparable<Publicacion> {
   private int codigo;
   private String titulo;
   private int año;

   public Publicacion (int codigo, String titulo, int año) {
      this.codigo = codigo;
      this.titulo = titulo;
      this.año = año;
   }

   public Publicacion (int codigo, String titulo) {
      this.codigo = codigo;
      this.titulo = titulo;
      this.año = LocalDate.now().getYear();
   }

   public int getCodigo() {
      return codigo;
   }

   public String getTitulo() {
      return titulo;
   }

   public int getAño() {
      return año;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Publicacion that = (Publicacion) o;
      return codigo == that.codigo && año == that.año && Objects.equals(titulo, that.titulo);
   }

   @Override
   public int hashCode() {
      return Objects.hash(codigo, titulo, año);
   }

   @Override
   public String toString () {
      return "Publicacion [" + this.codigo + "," + this.titulo + "," + this.año + "]";
   }

   @Override
	public int compareTo(Publicacion o) {
		if (this == o)
			return 0;
		int resultado = año - o.año;
		if (resultado == 0) {
			resultado = titulo.compareTo(o.titulo);
			if (resultado == 0)
				return codigo - o.codigo;
		}
		return resultado;
	}
}
