package Unidad3.EjerciciosRegex;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio04 {
   public static void main(String[] args) {
      /*
      Escribe un programa que calcule el costo total de diferentes tipos de muebles. Se introducirán los datos
      necesarios en varias líneas de texto finalizando con la línea "comprar". Para que cada línea sea válida,
      debe tener el siguiente formato:

                     >>nombre del mueble<<precio:cantidad

      Donde:
            - nombre del mueble es cualquier secuencia de caracteres alfabéticos.
            - precio es un número en notación decimal que puede incluir opcionalmente un máximo de dos
            decimales que se separan de la parte entera con una coma.
            - cantidad es un número entero en notación decimal.

      Una vez finalizada la entrada se imprimirá una lista de muebles comprados y el precio total.
      */

      Scanner sc = new Scanner(System.in);
      Pattern pattern = Pattern.compile(">>\\w+<<(\\d+(?:.\\d{1,2})?):(\\d+)");

      System.out.println(">: ");
      String linea = sc.nextLine();
      double total = 0;
      Scanner palabraScanner = new Scanner(linea);
      
      while (palabraScanner.hasNext()) {
         String s = palabraScanner.next();
         Matcher m = pattern.matcher(s);
         if (m.matches()) {
            double precio = Double.parseDouble(m.group(1));
            double cantidad = Double.parseDouble(m.group(2));
            total += precio * cantidad;
         }
      }

      System.out.printf("El precio total es: %.2f", total);

      palabraScanner.close();
      sc.close();
   }
}
