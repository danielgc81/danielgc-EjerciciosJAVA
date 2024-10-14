package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    // Crea un método que acepte dos caracteres cualesquiera y muestre en la consola todos los caracteres
    //comprendidos entre ambos.
    //A continuación, escribe un programa que lo ponga a prueba

    static void mostrarCaracteres(char c1, char c2){
        for(char i = c1; i <= c2; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        mostrarCaracteres('A','¿');
    }
}
