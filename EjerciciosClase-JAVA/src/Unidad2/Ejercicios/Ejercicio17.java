package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    // Escribe un programa para jugar al juego de adivinar el número desconocido:
    //      • El programa genera un número aleatorio comprendido entre 1 y N, siendo N otro número
    //        aleatorio comprendido entre 1.000 y 100.000.
    //      • Después muestra el mensaje “He pensado un número entre 1 y N, adivina cuál es: “. El usuario
    //        tendrá que introducir números hasta que acierte.
    //      • Por cada respuesta no acertada el programa dirá si el valor introducido es mayor o menor que
    //        la respuesta correcta y volverá a preguntar.
    //      • Cuando el usuario responda correctamente, el programa dirá cuántos intentos han sido
    //        necesarios para adivinar el número le preguntará al usuario si desea volver a jugar.

    static void juego () {
        int contadorIntentos = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            double n = (Math.random() * 100000) + 1000;
            double numRandom = (Math.random() * n) + 1;
            System.out.printf("He pensado un número entre 1 y %d\n", (int) n);
            while (true) {
                System.out.println("Introduce tu número: ");
                int numElegido = sc.nextInt();
                if (numElegido > (int) numRandom) {
                    System.out.println("El número es mayor que el número secreto");
                    contadorIntentos++;
                } else if (numElegido < (int) numRandom) {
                    System.out.println("El número es menor que el número secreto");
                    contadorIntentos++;
                } else if ((int) numRandom == numElegido) {
                    System.out.println("Has acertado el número secreto!! Felicidades!!");
                    contadorIntentos++;
                    if (contadorIntentos == 1) {
                        System.out.println("Necesitaste 1 intento para adivinar el numero secreto");
                    } else {
                        System.out.println("Necesitaste " + contadorIntentos + " intentos para adivinar el numero secreto");
                    }

                    System.out.println();

                    System.out.println("¿Deseas volver a jugar? (0: Salir, Cualquier numero: Seguir)");
                    int respuesta = sc.nextInt();
                    if (respuesta == 0) {
                        System.exit(0);
                    } else if (respuesta > 0) {
                        juego();
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        juego();
    }
}
