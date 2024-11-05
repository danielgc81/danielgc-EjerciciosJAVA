package Unidad3.EjerciciosRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio01 {
   public static void main(String[] args) throws IOException {
      /* 
      Las secuencias de ADN se componen de un lenguaje sencillo de cuatro letras con los símbolos {A, C, G,
      T}. Tres letras consecutivas se conocen como codón, por lo que ACT y TCG son ambos codones. Un gen
      es una colección de al menos tres codones que comienza con un codón ATG y termina con un codón
      TAA, TAG o TGA.

      Escribe un programa Java que lea un fichero de texto con un BufferedReader y muestre cada línea
      seguida de “ACEPTADA” o “RECHAZADA” para indicar si dicha línea se acepta como secuencia de ADN
      o se rechaza
      */

      // Regex -> ATG([ACGT]{3})+(TAA|TAG|TGA){1}

      try (BufferedReader in = new BufferedReader(new InputStreamReader(Ejercicio01.class.getResourceAsStream("/adn.txt")))) {
         String linea;
         Pattern pattern = Pattern.compile("ATG([ACGT]{3})+(TAA|TAG|TGA)");
         while ((linea = in.readLine()) != null) {
            System.out.print(linea + " -> ");
            Matcher m = pattern.matcher(linea);

            System.out.println(m.matches() ? "ACEPTADA" : "RECHAZADA");
         }
      }
   }
}
