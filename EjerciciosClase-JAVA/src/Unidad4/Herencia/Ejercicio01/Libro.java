package Unidad4.Herencia.Ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Libro extends Publicacion implements Prestable {
   private ArrayList<String> autores;
   private boolean estaPrestado;

   public Libro(int codigo, String titulo, int año, String... autores) {
      super(codigo, titulo, año);
      this.estaPrestado = false;
   }

   public Libro(int codigo, String titulo, String... autores) {
      super(codigo, titulo);
      this.estaPrestado = false;
   }

   public ArrayList<String> getAutores() {
      return autores;
   }

   public void setAutores(ArrayList<String> autores) {
      this.autores = autores;
   }

   public boolean isPrestado () {
      return estaPrestado;
   }

   public void setEstaPrestado (boolean estaPrestado) {
      this.estaPrestado = estaPrestado;
   }

   public void prestar () {
      if (!estaPrestado) {
         System.out.println("Libro Prestado");
         this.estaPrestado = true;
      } else {
         System.out.println("El libro ya esta prestado");
      }
   }

   public void devolver () {
      if (estaPrestado) {
         System.out.println("Libro devuelto");
         this.estaPrestado = false;
      } else {
         System.out.println("El libro no esta prestado");
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      if (!super.equals(o)) return false;
      Libro libro = (Libro) o;
      return Objects.equals(autores, libro.autores);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), autores);
   }

   @Override
   public String toString () {
      return "Libro [" + getCodigo() + "," + getTitulo() + "," + getAño() + "," + getAutores() + "]";
   }

   @Override
	public int compareTo(Publicacion o) {
      if (this == o) {
         return 0;
      }
      int resultado = super.compareTo(o);
      if (resultado == 0) {
         if (getClass() != o.getClass()) {
            return autoresComparator.compare(this.autores, ((Libro)o).autores);
         } else {
            return getClass().getName().compareTo(o.getClass().getName());
         }
      }
      return resultado;
	}

   static Comparator<ArrayList<String>> autoresComparator = new Comparator<>() {
		@Override
		public int compare(ArrayList<String> o1, ArrayList<String> o2) {
			int min = Integer.min(o1.size(), o2.size());
			int i = 0;
			int resultado;
			while ((resultado = o1.get(i).compareTo(o2.get(i))) == 0 && i < min)
				i++;
			if (resultado == 0 && i == o1.size())
				return -1;
			else if (resultado == 0 && i == o2.size())
				return 1;
			return resultado;
		}
	};
}
