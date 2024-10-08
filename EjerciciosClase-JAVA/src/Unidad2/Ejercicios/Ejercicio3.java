package Unidad2.Ejercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    //Crea un método que acepte un número entero y retorne true si es par o false si es impar.
    //Finalmente, escribe un programa que lo ponga a prueba

    static boolean esParoImpar(int numero){
        boolean esPar = false;
        if (numero % 2 == 0){
            esPar = true;
        } else if (numero % 2 != 0){
            esPar = false;
        }
        return esPar;
    }

    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce un numero entero: ");
            int numero = sc.nextInt();
            boolean par = esParoImpar(numero);

            if (par){
                System.out.printf("El %d es par\n", numero);
            } else {
                System.out.printf("El %d NO es par\n", numero);
            }
        }
    }
}
