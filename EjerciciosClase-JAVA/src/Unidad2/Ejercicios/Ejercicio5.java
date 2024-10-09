package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Escribe un programa que pida por teclado un nombre de un mes y muestre el número de días que
        // tiene. Si el nombre introducido no es correcto, se mostrará un mensaje de error

        // Variables
        String mes;

        // Pidiendo al usuario que introduzca el numero de un mes del año
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de un mes (1 - 12): ");
        mes = sc.next();

        // Dependiendo del mes elegido mostrara la cantidad de días que tiene ese mes
        switch (mes) {
            case "Enero":
                System.out.println("Enero tiene 31 días");
                break;
            case "Febrero":
                System.out.println("Febrero tiene 28 días, 29 diás si es año bisiesto");
                break;
            case "Marzo":
                System.out.println("Marzo tiene 31 días");
                break;
            case "Abril":
                System.out.println("Abril tiene 30 días");
                break;
            case "Mayo":
                System.out.println("Mayo tiene 31 días");
                break;
            case "Junio":
                System.out.println("Junio tiene 30 días");
                break;
            case "Julio":
                System.out.println("Julio tiene 31 días");
                break;
            case "Agosto":
                System.out.println("Agosto tiene 31 días");
                break;
            case "Septiembre":
                System.out.println("Septiembre tiene 30 días");
                break;
            case "Octubre":
                System.out.println("Octubre tiene 31 días");
                break;
            case "Noviembre":
                System.out.println("Noviembre tiene 30 días");
                break;
            case "Diciembre":
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("\u001B[31mERROR: no has introducido un mes correcto\u001B[0m");
        }
    }
}
