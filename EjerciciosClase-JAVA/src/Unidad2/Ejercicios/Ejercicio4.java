package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        // Escribe un programa que pida por teclado un número de mes y muestre el número de días que tiene. Si
        // el usuario no introduce un valor entre 1 y 12, se mostrará un mensaje de error

        // Variables
        int mes = 0;

        // Pidiendo al usuario que introduzca el numero de un mes del año
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de un mes (1 - 12): ");
        mes = sc.nextInt();

        // Dependiendo del numero elegido mostrara la cantidad de días que tiene ese mes
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días, 29 diás si es año bisiesto");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("\u001B[31mERROR: no has introducido un numero correcto\u001B[0m");
        }
    }
}
