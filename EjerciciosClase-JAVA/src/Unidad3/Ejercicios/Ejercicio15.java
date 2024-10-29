package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    static String subcadenaMasLargaSinDuplicados(String s) {
        int inicio = 0;
        int maxLongitud = 0;
        String subcadenaLarga = "";

        for (int fin = 0; fin < s.length(); fin++) {
            char caracter = s.charAt(fin);

            for (int j = inicio; j < fin; j++) {
                if (s.charAt(j) == caracter) {
                    inicio = j + 1;
                    break;
                }
            }

            int longitudActual = fin - inicio + 1;
            if (longitudActual > maxLongitud) {
                maxLongitud = longitudActual;
                subcadenaLarga = s.substring(inicio, fin + 1);
            }
        }
        return subcadenaLarga;
    }

    public static void main(String[] args) {
        // Escribe un programa que lea líneas de texto por teclado y por cada línea leída muestre la subcadena
        // más larga sin caracteres duplicados

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce una frase (fin para salir): ");
            String s = sc.nextLine();

            if (s.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.printf("La subcadena más larga es: %s\n", subcadenaMasLargaSinDuplicados(s));
        }

        sc.close();
    }
}
