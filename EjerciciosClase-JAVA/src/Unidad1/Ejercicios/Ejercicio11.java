package Unidad1.Ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        //Escribe un programa que calcule el sueldo de un vendedor a partir de su sueldo base y de la comisión
        //por ventas (10% del importe de cada venta) sabiendo que este mes ha realizado tres ventas. Se
        //mostrará el sueldo total, la comisión de cada venta y la comisión total

        Scanner sc = new Scanner(System.in);
        // Sueldo base del vendedor
        System.out.println("Introduce el sueldo base del vendedor: ");
        double sueldoBase = sc.nextDouble();

        // valor de las ventas que realiza
        System.out.println("Introduce el importe de la primera venta: ");
        double venta1 = sc.nextDouble();

        System.out.println("Introduce el importe de la segunda venta: ");
        double venta2 = sc.nextDouble();

        System.out.println("Introduce el importe de la tercera venta: ");
        double venta3 = sc.nextDouble();

        // Comisiones de cada venta
        double comision1 = venta1 * 0.10;
        double comision2 = venta2 * 0.10;
        double comision3 = venta3 * 0.10;

        // Comisión total
        double comisionTotal = comision1 + comision2 + comision3;
        double sueldoTotal = sueldoBase + comisionTotal;

        System.out.printf("Comision de la primera venta: %.2f euros\n", comision1);
        System.out.printf("Comision de la segunda venta: %.2f euros\n", comision2);
        System.out.printf("Comision de la tercera venta: %.2f euros\n", comision3);
        System.out.printf("Comisión total: %.2f euros\n", comisionTotal);
        System.out.printf("Sueldo total del vendedor: %.2f euros", sueldoTotal);

        sc.close();
    }
}
