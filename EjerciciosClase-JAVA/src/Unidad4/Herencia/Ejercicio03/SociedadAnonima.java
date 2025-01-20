package Unidad4.Herencia.Ejercicio03;

import java.util.ArrayList;

public class SociedadAnonima implements Empresa {
   private String nombre;
   private ArrayList<EmpresaServicios> listaTrabajos = new ArrayList<>();

   public SociedadAnonima (String nombre, ArrayList<EmpresaServicios> listaTrabajos) {
      this.nombre = nombre;
      this.listaTrabajos = listaTrabajos;
   }

   public String getNombre () {
      return nombre;
   }

   public ArrayList<EmpresaServicios> getListaTrabajo () {
      return listaTrabajos;
   }
}
