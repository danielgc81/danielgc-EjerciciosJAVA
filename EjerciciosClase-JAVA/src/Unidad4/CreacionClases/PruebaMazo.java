package Unidad4.CreacionClases;

import java.util.Scanner;

public class PruebaMazo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Mazo mazo = new Mazo();
      
      while (!mazo.estaVacio()) {
         mazo.barajar();
   
         int naipeJugador;
         System.out.println(mazo.getBaraja());
         do {
            System.out.println("Elige un naipe (0 - " + (mazo.getBaraja().size() - 1) + "):");
            naipeJugador = sc.nextInt();
            if ( naipeJugador >= 0 && naipeJugador < mazo.getBaraja().size() ) {
               break;
            }
         } while (true);
   
         Naipe naipeJugadorObj = mazo.getNaipe(naipeJugador);
         mazo.retirar(naipeJugadorObj);
         Naipe naipeOrdenadorObj = mazo.retirarRandomNaipe();
   
         if (naipeJugadorObj.getRango().getValor() > naipeOrdenadorObj.getRango().getValor()) {
            System.out.println("¡Has ganado!");
         } else if (naipeJugadorObj.getRango().getValor() < naipeOrdenadorObj.getRango().getValor()) {
            System.out.println("¡Has perdido!");
         } else {
            System.out.println("¡Empate!");
         }
   
         System.out.println("Tu naipe: " + naipeJugadorObj);
         System.out.println("Naipe Ordenador: " + naipeOrdenadorObj);
      }

      System.out.println();
      System.out.println("Ya no hay mas cartas, Game Over");

      sc.close();
   }
}
