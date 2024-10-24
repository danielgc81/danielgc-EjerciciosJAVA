package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    static char primerCaracterNoRepetido (String txt) {
        for (int i = 0; i < txt.length(); i++) {
            boolean repetido = false;
            for (int j = 0; j < txt.length(); j++) {
                if (i != j && txt.charAt(i) == txt.charAt(j)) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                return txt.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        // Escribe un programa que lea líneas hasta que se introduzca en una de ellas la cadena "fin" sin importar
        // si se hace en mayúsculas o en minúsculas o en cualquier combinación de ambas. Por cada línea leída,
        // excepto la última, mostrará cuál es el primer carácter que no se repite

        Scanner sc = new Scanner(System.in);
        while (true) {
            String txt = "";
            System.out.println("Introduce un texto (Introduce una linea o 'fin' para terminar): ");
            txt = sc.nextLine();

            if (txt.equalsIgnoreCase("fin")) {
                break;
            }

            if (primerCaracterNoRepetido(txt) != '\0') {
                System.out.println("El primer caracter que no se repite es " + primerCaracterNoRepetido(txt));
            } else {
                System.out.println("No hay ningun caracter que no se repita");
            }
        }
    }
}
