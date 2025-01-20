package Unidad4.Herencia.Ejercicio03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
      EmpresaServicios empresa1 = new EmpresaServicios("Servicios Informáticos", new Trabajo("Informática"),32434);
      EmpresaServicios empresa2 = new EmpresaServicios("Limpieza Total", new Trabajo("Limpieza"), 32432);
      EmpresaServicios empresa3 = new EmpresaServicios("Construcciones Modernas", new Trabajo ("Construcción"), 43232);

      ArrayList<EmpresaServicios> trabajos = new ArrayList<>();
      trabajos.add(empresa1);
      trabajos.add(empresa2);
      trabajos.add(empresa3);

      ArrayList<Remuneracion> pagos = new ArrayList<>();
      pagos.add(new Asalariados("Daniel", "Garrido", LocalDate.of(2024, 11, 4), 4376532));
      pagos.add(new Contratista("Ivan", "Garrido", LocalDate.of(2016, 8, 14), 46433, new SociedadAnonima("Inf@rmatics INC S.A.", trabajos)));
      pagos.add(empresa1);
      pagos.add(empresa2);
      pagos.add(empresa3);

      for (int i = 0; i < pagos.size(); i++) {
         Random r = new Random();
         int cobro = r.nextInt(2500) + 500;
         pagos.get(i).cobrarServicio(cobro);
      }
   }
}
