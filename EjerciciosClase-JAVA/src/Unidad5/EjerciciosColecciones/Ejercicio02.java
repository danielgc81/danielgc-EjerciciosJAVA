package Unidad5.EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Ejercicio02 {
   public static void main(String[] args) {
      // Crea un programa que realice las tareas siguientes:
      //• Almacenar en una lista 100 números aleatorios entre 1 y 100 y mostrarlos todos utilizando uno de
      // los métodos de iteración.
      // • Almacenar los números de la lista original en otra colección sin que se repita ninguno y mostrarlos
      // todos usando un método de iteración diferente al anterior.
      // • Almacenar los números de la lista original en otra colección en la que se almacenen ordenados y sin
      //que se repita ninguno y mostrarlos todos usando un método de iteración diferente al anterior.

      ArrayList<Integer> numbers = new ArrayList<>();
      Random r = new Random();

      // Primer punto
      for (int i = 0;i < 100; i++) {
         numbers.add(r.nextInt(100) + 1);
         System.out.println(numbers.get(i));
      }

      System.out.println();

      // Segundo punto
      ArrayList<Integer> numbersNoRepeat = new ArrayList<>();
      for (Integer number : numbers) {
         if (!numbersNoRepeat.contains(number)) {
            numbersNoRepeat.add(number);
            System.out.println(number);
         }
      }

      System.out.println();

      // Tercer punto
      TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
      for (Integer number : sortedNumbers) {
         System.out.println(number);
      }
   }
}
