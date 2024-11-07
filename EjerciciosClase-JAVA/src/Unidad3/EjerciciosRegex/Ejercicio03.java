package Unidad3.EjerciciosRegex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio03 {
   public static void main(String[] args) {
      // Escribe un programa que use una expresión regular para validar fechas, teniendo en cuenta que una
      // fecha es válida si cumple las condiciones siguientes:

      //       • Comienza por dos dígitos para el día del mes seguidos de un separador.
      //       • A continuación, le siguen tres letras para el mes o dos dígitos para el número del mes, seguidos
      //         de un separador.
      //       • A continuación, le siguen cuatro dígitos para el año.
      //       • El separador puede ser un guion (-) o la barra inclinada (/), pero esta última sólo cuando el
      //         mes se expresa con dos dígitos.
      //       • No se pueden combinar diferentes separadores en una misma fecha.

      // Regex: ^(([0-2][0-9]|3[0-1]){1}/(0[1-9]|1[0-2]){1}/[0-9]{4})|(([0-2][0-9]|3[0-1]){1}-([a-zA-Z]{3}|(0[1-9]|1[0-2])){1}-[0-9]{4})$

      // El usuario introducirá fechas y el programa tendrá que determinar si son válidas o no.

      Scanner sc = new Scanner(System.in);
      
      Pattern pattern = Pattern.compile("^(([0-2][0-9]|3[0-1]){1}/(0[1-9]|1[0-2]){1}/[0-9]{4})|(([0-2][0-9]|3[0-1]){1}-([a-zA-Z]{3}|(0[1-9]|1[0-2])){1}-[0-9]{4})$");
      
      while (true) {
         System.out.println("fecha: ");
         String fecha = sc.next();

         if (fecha.equalsIgnoreCase("exit")) {
            break;
         }

         Matcher m = pattern.matcher(fecha);

         boolean coincidencia = m.matches();
         System.out.println("¿Es una fecha válida?, " + (coincidencia ? true : false));
      }

      sc.close();
   }
}
