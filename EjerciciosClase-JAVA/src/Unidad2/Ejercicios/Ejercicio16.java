package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    // Crea un método que acepte un número entero n y retorne la suma de la serie.
    // Crea un programa que ponga a prueba este método con diferentes valores de n leídos
    // por teclado y finalice cuando el usuario introduzca un número menor o igual que cero

    static double serie(int num) {
        double serieFracción = 0;
        if (num >= 1) {
            for (double i = 1; i <= num; i++) {
                serieFracción += (1 / i);
            }
        } else if (num <= 0) {
            System.exit(0);
        }
        return serieFracción;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Introduzca un número positivo cualquiera (0 -> Salir):");
            int num = sc.nextInt();
            System.out.printf("El resultado es %.3f\n", serie(num));
        }
    }
}
