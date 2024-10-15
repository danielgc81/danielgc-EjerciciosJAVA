package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    // Escribe un programa que lea por teclado las coordenadas en el plano de los centros de dos
    // circunferencias y la longitud de sus respectivos radios. Finalmente, se mostrará en la consola si ambas
    // son exteriores, tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas

    static String tipoTriangulo(int x1, int y1, int x2, int y2, int longitudRadio1, int longitudRadio2) {
        int distanciaCentro = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        String tipo;

        if (distanciaCentro == (longitudRadio1 + longitudRadio2)){
            tipo = "Son circunferencias tangentes exteriores";
        } else if (distanciaCentro < (longitudRadio1 + longitudRadio2) && distanciaCentro > (longitudRadio1 - longitudRadio2)){
            tipo = "Son circunferencias secantes";
        } else if (distanciaCentro == (longitudRadio1 - longitudRadio2)){
            tipo = "Son circunferencias tangentes inferiores";
        } else if (distanciaCentro < (longitudRadio1 - longitudRadio2)) {
            tipo = "Son circunferencias interiores";
        } else if (distanciaCentro > (longitudRadio1 + longitudRadio2)){
            tipo = "Son circunferencias exteriores";
        } else {
            tipo = "Son circunferencias concentricas";
        }
        return String.format("%s",tipo);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor x1: ");
        int x1 = sc.nextInt();

        System.out.println("Valor y1: ");
        int y1 = sc.nextInt();

        System.out.println("Valor x2: ");
        int x2 = sc.nextInt();

        System.out.println("Valor y2: ");
        int y2 = sc.nextInt();

        System.out.println("Valor longitud del radio circulo 1: ");
        int longitudRadio1 = sc.nextInt();

        System.out.println("Valor longitud del radio circulo 2: ");
        int longitudRadio2 = sc.nextInt();


        System.out.println(tipoTriangulo(x1,y1,x2,y2,longitudRadio1,longitudRadio2));
    }
}
