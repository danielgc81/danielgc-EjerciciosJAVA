package Unidad4.CreacionClases;

import java.util.Random;
import java.util.Scanner;

public class PruebaMazo {
   public static void main(String[] args) {
      Random r = new Random();
      Scanner sc = new Scanner(System.in);
      Mazo mazo = new Mazo();

      mazo.barajar();

      int naipeJugador;
      do {
         System.out.println("Elige un naipe:");
         naipeJugador = sc.nextInt();
         if ( naipeJugador >= 0 && naipeJugador < mazo.getBaraja().size() ) {
            break;
         }
      } while (true);

      Naipe naipeJugadorObj = mazo.getNaipe(naipeJugador);
      int naipeOrdenador = r.nextInt(mazo.getBaraja().size());
      Naipe naipeOrdenadorObj = mazo.getNaipe(naipeOrdenador);

      if (naipeJugadorObj.getRango().getValor() > naipeOrdenadorObj.getRango().getValor()) {
         System.out.println("¡Has ganado!");
      } else if (naipeJugadorObj.getRango().getValor() < naipeOrdenadorObj.getRango().getValor()) {
         System.out.println("¡Has perdido!");
      } else {
         System.out.println("¡Empate!");
      }

      System.out.println("Tu naipe: " + naipeJugadorObj);
      System.out.println("Naipe Ordenador: " + naipeOrdenadorObj);

      sc.close();
   }
}
