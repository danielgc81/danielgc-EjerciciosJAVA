package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    //Crea los métodos siguientes:
    //• Método que clasifique un triángulo a partir de la longitud de sus lados como equilátero,
    //isósceles, escaleno o imposible (ver teorema de la desigualdad del triángulo).
    //• Método que clasifique un triángulo a partir del valor de sus ángulos interiores como
    //acutángulo, rectángulo, obtusángulo o imposible (la suma de sus ángulos interiores es distinta
    //de 180).
    //Busca en Internet la información que te permita resolver el problema.
    //Finalmente, escribe un programa para poner a prueba estos métodos mostrando un menú donde el
    //usuario pueda elegir entre uno de los dos tipos de clasificación de triángulos. Una vez hecha la
    //elección, el programa le pedirá por teclado los datos necesarios y mostrará el resultado. Para que este
    //proceso se pueda repetir indefinidamente, el menú deberá incluir una opción que permita finalizar el
    //programa

    static String longitudTriangulo(int lado1, int lado2, int lado3) {
        String tipoTriangulo = "";

        if ((lado1 + lado2 < lado3) || (lado1 + lado3 < lado2) || (lado2 + lado3 < lado1)) {
            tipoTriangulo = "imposible";
        } else if ((lado1 == lado2 || lado2 == lado3 || lado3 == lado1) && (lado1 != lado2 || lado2 != lado3 || lado3 != lado1)) {
            tipoTriangulo = "isósceles";
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            tipoTriangulo = "escaleno";
        } else if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "equilátero";
        }

        return String.format("%s", tipoTriangulo);
    }

    static String angulosTriangulo(int angulo1, int angulo2, int angulo3) {
        String tipoTriangulo = "";

        if (angulo1 + angulo2 + angulo3 != 180) {
            tipoTriangulo = "imposible";
        } else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            tipoTriangulo = "rectángulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            tipoTriangulo = "obtusangulo";
        } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            tipoTriangulo = "acutángulo";
        }

        return String.format("%s", tipoTriangulo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flujoWhile = true;

        while (flujoWhile) {
            System.out.println("¿Qué tipo de triangulo es?");
            System.out.println("Clasificación de triangulos: ");
            System.out.println("Por longitud de lados -> Opción 1");
            System.out.println("Por los angulos -> Opción 2");
            System.out.println("Salir -> Opción 0");
            System.out.println("Introduce una opción: ");

            int opciónElegida = sc.nextInt();
            if (opciónElegida == 1) {
                System.out.println("Valor lado1:");
                int lado1 = sc.nextInt();
                System.out.println("Valor lado2:");
                int lado2 = sc.nextInt();
                System.out.println("Valor lado3:");
                int lado3 = sc.nextInt();

                System.out.printf("Es un triangulo %s\n", longitudTriangulo(lado1, lado2, lado3));
            } else if (opciónElegida == 2) {
                System.out.println("Valor angulo1:");
                int angulo1 = sc.nextInt();
                System.out.println("Valor angulo2:");
                int angulo2 = sc.nextInt();
                System.out.println("Valor angulo3:");
                int angulo3 = sc.nextInt();

                System.out.printf("Es un triangulo %s\n", angulosTriangulo(angulo1, angulo2, angulo3));
            } else if (opciónElegida == 0) {
                System.out.println("¿Deseas salir del programa? (1: Sí, 2: No)");
                int salir = sc.nextInt();
                if (salir == 1) {
                    System.exit(0);
                } else if (salir == 2){
                    flujoWhile = true;
                }
            } else {
                System.out.println("ERROR: Elige una opción válida");
            }
        }
    }
}