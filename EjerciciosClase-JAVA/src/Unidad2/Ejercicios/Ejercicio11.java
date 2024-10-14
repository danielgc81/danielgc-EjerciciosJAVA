package Unidad2.Ejercicios;

public class Ejercicio11 {
    public static void main(String[] args){
        // Escribe un programa que genere números aleatorios y los muestre en la consola hasta que encontrar
        // un número par. Éste último no se mostrará en la consola, pero antes de que finalice el programa se
        // mostrarán los mensajes siguientes:
        // • “se han encontrado n números impares” si se han encontrado 2 o más números
        // impares, sustituyendo n por la cantidad que corresponda.
        // • “se ha encontrado 1 número impar” si sólo se ha encontrado un número impar.
        // • “no se han encontrado números impares” sin no se ha encontrado ningún número impar.


        int contador = 0;
        boolean condicion = true;

        do {
            double numeroRandom = (int) (Math.random() * 100) + 1;
            if (numeroRandom % 2 != 0){
                System.out.println(numeroRandom);
                contador++;
            } else if (numeroRandom % 2 == 0){
                condicion = false;
            }
        } while (condicion);

        if (contador == 1) {
            System.out.println("Se ha encontrado 1 número impar");
        } else if (contador == 0){
            System.out.println("No se han encontrado numeros impares");
        } else {
            System.out.println("Se han encontrado " + contador + " números impares");
        }
    }
}
