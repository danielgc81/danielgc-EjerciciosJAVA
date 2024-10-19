package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio23 {
    // Crea un método que acepte las coordenadas de dos puntos en el espacio de dos dimensiones y retorne
    // la distancia entre ambos. Escribe un programa que utilice este método para calcular tantas distancias
    // como desee el usuario, dando la opción a salir del programa después de mostrar cada resultado

    static String distancia (int x1 , int y1, int x2, int y2) {
        int distanciaEntrePuntos = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        return String.format("La distancia entre estos dos puntos es de %d", distanciaEntrePuntos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Introduce las coordenadas de estos puntos -> ");
            System.out.println("x1: ");
            int x1 = sc.nextInt();
            System.out.println("y1: ");
            int y1 = sc.nextInt();
            System.out.println("x2: ");
            int x2 = sc.nextInt();
            System.out.println("y2: ");
            int y2 = sc.nextInt();

            System.out.println(distancia(x1, y1, x2, y2));

            System.out.println("¿Deseas introducir otras coordenadas o salir del Programa? (0: Salir / Cualquier numero: seguir)");
            int respuesta = sc.nextInt();
            if (respuesta == 0) {
                System.exit(0);
            }
        }
    }
}
