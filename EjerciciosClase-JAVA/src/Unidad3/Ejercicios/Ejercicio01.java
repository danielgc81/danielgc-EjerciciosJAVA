package Unidad3.Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args){
        // Programa que lea una cadena de teclado y muestre por pantalla el número de veces que aparece cada vocal en ella

        // Contadores de las vocales
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String txt = sc.nextLine().toLowerCase(); // Usamos nextLine() para obviar los espacios y toLowerCase() para que el texto pasado se transforme en minúsculas

        for (char x = 0; x < txt.length(); x++) {
            // charAt (Obtiene el valor de la posición del caracter de un String)
            char caracter = txt.charAt(x);

            if (caracter == 'a' || caracter == 'A') {
                a++;
            } else if (caracter == 'e' || caracter == 'E') {
                e++;
            } else if (caracter == 'i' || caracter == 'I') {
                i++;
            } else if (caracter == 'o' || caracter == 'O') {
                o++;
            } else if (caracter == 'u' || caracter == 'U') {
                u++;
            }
        }

        // Vocales totales en el texto pasado por teclado
        int vocalesTotales = a + e + i + o + u;
        System.out.printf("a: %d\ne: %d\ni: %d\no: %d\nu: %d\n", a , e , i, o, u);
        System.out.printf("Hay %d vocales en total", vocalesTotales);
    }
}
