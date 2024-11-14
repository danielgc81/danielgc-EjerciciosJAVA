package Unidad3.EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio01 {
   public static void main(String[] args) {
      // Programa que simule el lanzamiento de un dado N veces, siendo N un número entero que se
      // introducirá por teclado. Antes de finalizar mostrará el número de veces que salió cada una de las caras.
      
      Scanner sc = new Scanner(System.in);
      
      while (true) {
         System.out.println("Cuantas veces quieres lanzar el dado: ");
         int nLanazaminetos = sc.nextInt();
   
         int[] carasDado = new int[6];
   
         for (int i = 0; i < nLanazaminetos; i++) {
            int n = (int) (Math.random() * carasDado.length) + 0;
            carasDado[n]++;
         }
   
         System.out.println("¿Cuantas veces han salido las caras de un dado?: ");
         for (int i = 0; i < carasDado.length; i++) {
            System.out.println(i + " -> " + carasDado[i]);
         }

         System.out.println("¿Desea salir del Programa? (Escriba 'exit' para salir): ");
         String respuesta = sc.next();
         if (respuesta.equalsIgnoreCase("exit")) {
            break;
         }
      }
      
      sc.close();
   }
}
