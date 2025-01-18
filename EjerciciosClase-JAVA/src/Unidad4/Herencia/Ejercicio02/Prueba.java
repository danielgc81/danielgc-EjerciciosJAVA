package Unidad4.Herencia.Ejercicio02;

import java.util.ArrayList;

public class Prueba {
   public static void main(String[] args) {
      try {

         Lavadora lavadora1 = new Lavadora(Color.BLANCO, 'A', 60, 8);
         Lavadora lavadora2 = new Lavadora(Color.ROJO, 'B', 70, 10);
         Lavadora lavadora3 = new Lavadora(Color.AZUL, 'C', 80, 12);
         Lavadora lavadora4 = new Lavadora(Color.GRIS, 'D', 50, 6);

         Frigorifico frigorifico1 = new Frigorifico(Color.BLANCO, 'A', 80, true);
         Frigorifico frigorifico2 = new Frigorifico(Color.ROJO, 'B', 90, false);
         Frigorifico frigorifico3 = new Frigorifico(Color.AZUL, 'C', 100, false);
         Frigorifico frigorifico4 = new Frigorifico(Color.GRIS, 'D', 70, true);

         Television television1 = new Television(Color.BLANCO, 'A', 20, 32, "DVB-T");
         Television television2 = new Television(Color.ROJO, 'B', 25, 42,  "DVB-T2");
         Television television3 = new Television(Color.AZUL, 'C', 30, 60, "DVB-T");
         Television television4 = new Television(Color.GRIS, 'D', 15, 24,  "DVB-T2");


         ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

         electrodomesticos.add(lavadora1);
         electrodomesticos.add(lavadora2);
         electrodomesticos.add(lavadora3);
         electrodomesticos.add(lavadora4);
         electrodomesticos.add(frigorifico1);
         electrodomesticos.add(frigorifico2);
         electrodomesticos.add(frigorifico3);
         electrodomesticos.add(frigorifico4);
         electrodomesticos.add(television1);
         electrodomesticos.add(television2);
         electrodomesticos.add(television3);
         electrodomesticos.add(television4);

         System.out.println(electrodomesticos);
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
