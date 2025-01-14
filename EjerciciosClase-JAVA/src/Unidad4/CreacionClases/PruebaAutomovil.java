package Unidad4.CreacionClases;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaAutomovil {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int longitudLinea = Integer.parseInt(sc.nextLine()); 
      ArrayList<Automovil> autos = new ArrayList<>();

      for (int i = 0; i < longitudLinea; i++) {
         String[] datosSeparados = sc.nextLine().split(" ");
         String modelo = datosSeparados[0];
         int capacidadDeposito = Integer.parseInt(datosSeparados[1]);
         int cantidadCombustible = Integer.parseInt(datosSeparados[2]);
         int consumoPorKm = Integer.parseInt(datosSeparados[3]);
         autos.add(new Automovil(modelo, capacidadDeposito, cantidadCombustible, consumoPorKm));
      }

      while (sc.hasNextLine()) {
         String linea = sc.nextLine();
         if (linea.equalsIgnoreCase("fin")) {
            break;
         }

         String datos[] = linea.split(" ");
         String comando = datos[0];
         String modelo = datos[1];
         int km = Integer.parseInt(datos[2]);

         if (comando.equals("desplazar")) {
            for (Automovil auto : autos) {
               if (auto.getModelo().equals(modelo)) {
                  auto.desplazar(km);
               } 
            }
         }
      }

      sc.close();
   }
}
