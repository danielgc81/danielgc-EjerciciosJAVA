package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        // Escribe un programa que lea por teclado las coordenadas en el plano de los centros de dos
        // circunferencias y la longitud de sus respectivos radios. Finalmente, se mostrará en la consola si ambas
        // son exteriores, tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas

        // Variables
        int x1;
        int y1;
        int x2;
        int y2;
        int longitudRadio1;
        int longitudRadio2;

        // Pidiendo por consola los valores de los puntos y la longitud de los radios
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor x1: ");
        x1 = sc.nextInt();
        System.out.println("Valor y1: ");
        y1 = sc.nextInt();
        System.out.println("Valor x2: ");
        x2 = sc.nextInt();
        System.out.println("Valor y2: ");
        y2 = sc.nextInt();
        System.out.println("Valor longitud del radio circulo 1: ");
        longitudRadio1 = sc.nextInt();
        System.out.println("Valor longitud del radio circulo 2: ");
        longitudRadio2 = sc.nextInt();

        // Calculo de la distancia entre dos puntos (En este caso los puntos asignados son el centro de la circunferencia)
        int distanciaCentro = Math.abs(x2 - x1) + Math.abs(y2 - y1);

        // Dependiendo de si se cumple o no las siguientes expresiones los circulos pueden ser...
        if (distanciaCentro == 0){
            System.out.println("Son circunferencias concentricas");
        } else if (distanciaCentro == (longitudRadio1 + longitudRadio2)){
            System.out.println("Son circunferencias tangentes exteriores");
        } else if (distanciaCentro < (longitudRadio1 + longitudRadio2) && distanciaCentro > (longitudRadio1 - longitudRadio2)){
            System.out.println("Son circunferencias secantes");
        } else if (distanciaCentro == (longitudRadio1 - longitudRadio2)){
            System.out.println("Son circunferencias tangentes inferiores");
        } else if (distanciaCentro < (longitudRadio1 - longitudRadio2)) {
            System.out.println("Son circunferencias interiores");
        } else if (distanciaCentro > (longitudRadio1 + longitudRadio2)){
            System.out.println("Son circunferencias exteriores");
        }
    }
}
