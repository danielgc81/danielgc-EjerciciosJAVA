package Unidad3.EjerciciosRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio02 {
   public static void main(String[] args) {
      /*
      Escribe un programa que use una expresión regular para encontrar nombres de personas en un texto,
      teniendo en cuenta que un nombre es válido si cumple las condiciones siguientes:

            • Está formado por dos o más palabras.
            • Cada palabra comienza por una letra mayúscula seguida de letras minúsculas.
            • Cada palabra debería tener al menos dos letras.
            • Las palabras se separan entre sí por un único espacio en blanco.
      
      El usuario introducirá una línea que contendrá varios nombres separados por comas y los mostrará de
      nuevo, cada uno en una línea 
      */

      Scanner sc = new Scanner(System.in);
      Pattern pattern = Pattern.compile("([A-Z][a-z]+|[A-Z][a-z]+ [A-Z][a-z]+)");
      System.out.println("texto: ");
      String nombre = sc.nextLine();
      
      Scanner nombres = new Scanner(nombre);
      nombres.useDelimiter(", {1}");

      while (nombres.hasNext()) {
         String palabraNombre = nombres.next();
         Matcher m = pattern.matcher(palabraNombre);
         
         if (m.matches()) {
            System.out.println(palabraNombre);
         }
      }
      
      nombres.close();
      sc.close();
   }
}
