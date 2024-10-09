package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
    // Crea un método que acepte un número entero entre 1 y 10 y retorne el resultado de convertirlo a un
    // número romano.
    // Finalmente, escribe un programa que lo ponga a prueba

    static String numeroRomano(int numero){
        String romano = "";
        if (numero == 1){
            romano = "I";
        } else if (numero == 2){
            romano = "II";
        } else if (numero == 3){
            romano = "III";
        } else if (numero == 4){
            romano = "IV";
        } else if (numero == 5){
            romano = "V";
        } else if (numero == 6){
            romano = "VI";
        } else if (numero == 7){
            romano = "VII";
        } else if (numero == 8){
            romano = "VIII";
        } else if (numero == 9){
            romano = "IX";
        } else if (numero == 10){
            romano = "X";
        }

        return romano;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Convertidor de numeros decimales en numeros romanos");
            System.out.println("Introduce un número:");
            int numero = sc.nextInt();
            if (numero >= 1 && numero <= 10){
                System.out.printf("El %d en números romanos es %s\n", numero, numeroRomano(numero));
                System.out.println();
            } else {
                System.out.println("\u001B[31mERROR: Introduce un numero del 1 al 10\u001B[0m");
                System.out.println();
            }
        }
    }
}
