package Unidad1.Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args){
        // Escribe un programa que muestre la división de 1234 entre 532, con un formato de salida de 15 dígitos,
        // de los cuales dos se usarán para la parte decimal.

        System.out.println("1234 / 532 = " + ((double) 1234 / 532));
        System.out.printf("1234 + 532 = %-5.2f 1234 / 745 = %-15.2f", 1234d / 532d, 1234d / 745f);
    }
}
