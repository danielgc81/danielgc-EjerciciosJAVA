package Unidad2.Ejercicios;

public class Ejercicio15 {
    // Crea un método llamado esPar que acepte un número entero y retorne true si ese número es par y
    // false si es impar. Escribe un programa que utilice este método para calcular el producto de los
    // doscientos mil primeros números impares

    static boolean esPar(int num){
        boolean par = true;
        if (num % 2 == 0) {
            par = true;
        } else if (num % 2 != 0) {
            par = false;
        }
        return par;
    }

    public static void main(String[] args){
        int multiplicacionImpares = 1;
        for (int i = 1; i < 200000 ; i++) {
            if (!esPar(i)) {
                multiplicacionImpares *= i;
                System.out.println("Numero: " + i + "\t Producto: " + multiplicacionImpares);
            }
        }
        System.out.println("El producto de los doscientos mil primeros numeros impares da " + multiplicacionImpares);
    }
}
