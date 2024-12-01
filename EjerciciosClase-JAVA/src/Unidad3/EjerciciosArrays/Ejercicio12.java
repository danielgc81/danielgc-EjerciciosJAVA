package Unidad3.EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio12 {
   /*
      Programa para la gestión de las calificaciones de los alumnos en las tres evaluaciones de una
      asignatura. El programa deberá pedir al profesor que introduzca por teclado los nombres de cada
      alumno junto a las calificaciones de cada evaluación. Después mostrará un menú que le permitirá
      realizar las acciones siguientes:
         1. Notas parciales y nota final (de un alumno)
         2. Notas parciales y nota final (de cada alumno)
         3. Media por evaluación y media del curso (de todos los alumnos)
         4. Nota más alta y nota más baja (mostrando a qué alumno y evaluación corresponde cada una)
         5. Salir.
      Almacenar los datos en cuantas estructuras de datos estáticas sea necesario y diseñar una solución
      basada en programación modular.
   */

   public static void mostrarMenu() {
      System.out.println();
         System.out.println("1. Notas parciales y nota final (de un alumno)");
         System.out.println("2. Notas parciales y nota final (de cada alumno)");
         System.out.println("3. Media por evaluación y media del curso (de todos los alumnos)");
         System.out.println("4. Nota más alta y nota más baja (mostrando a qué alumno y evaluación corresponde cada una)");
         System.out.println("5. Salir.");
   }

   public static void mostrarNotasAlumno(String[] nombres, double[][] notas) {
      System.out.println();
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce el nombre del alumno: ");
      String nombreAlumno = sc.next();

      boolean encontrado = false;
      for (int i = 0; i < nombres.length; i++) {
         if (nombres[i].equalsIgnoreCase(nombreAlumno)) {
            encontrado = true;
            double notaFinal = 0;
            System.out.println("Notas de " + nombres[i] + ":");
            for (int j = 0; j < notas[i].length; j++) {
               System.out.println("Evaulacion " + (j + 1) + ": " + notas[i][j]);
               notaFinal += notas[i][j];
            }
            System.out.printf("Nota Final: %.2f\n", (notaFinal / 3));
            break;
         }
      }
      if (!encontrado) {
         System.out.println("Alumno no encontrado");
      }
   }

   public static void mostrarTodasNotasAlumnos(String[] nombres, double[][] notas) {
      System.out.println();
      System.out.println("Notas de todos los alumnos: ");
      for (int i = 0; i < nombres.length; i++) {
         double notaFinal = 0;
         System.out.println("Notas de " + nombres[i] + ":");
         for (int j = 0; j < notas[i].length; j++) {
            System.out.println("Evaulación " + (j + 1) + ": " + notas[i][j]);
            notaFinal += notas[i][j];
         }
         System.out.printf("Nota Final: %.2f\n", (notaFinal / 3));
      }
   }

   public static void calcularMedias(double[][] notas) {
      System.out.println();
      System.out.println("Media por evaulacion y media del curso: ");
      double mediaCurso = 0;
      for (int j = 0; j < notas[0].length; j++) {
         double suma = 0;
         for (int i = 0; i < notas.length; i++) {
            suma += notas[i][j];
         }
         double mediaEval = suma / notas.length;
         mediaCurso += mediaEval;
         System.out.printf("Media Evaulación %d: %.2f\n", (j + 1), mediaEval);
      }
      System.out.printf("Media del curso: %.2f\n", mediaCurso / 3);
   }

   public static void notasMinMax(String[] nombres, double[][] notas) {
      System.out.println();

      double max = Double.MIN_VALUE; 
      double min = Double.MAX_VALUE;
      int evaulacionMaximo = 0;
      int evaulacionMinimo = 0;
      String nombreMaximo = "";
      String nombreMinimo = "";

      System.out.println("Nota mas baja y minima del curso: ");
      for (int i = 0; i < nombres.length; i++) {
         for (int j = 0; j < notas[i].length; j++) {
            if (notas[i][j] > max) {
               max = notas[i][j];
               evaulacionMaximo = j + 1;
               nombreMaximo = nombres[i];
            }
            if (notas[i][j] < min) {
               min = notas[i][j];
               evaulacionMinimo = j + 1;
               nombreMinimo = nombres[i];
            }
         }
      } 

      System.out.printf("%s sacó la nota mas alta, un %.2f en la %d evaulacion\n", nombreMaximo, max, evaulacionMaximo);
      System.out.printf("%s sacó la nota mas baja, un %.2f en la %d evaulacion\n", nombreMinimo, min, evaulacionMinimo);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Base de Datos de los Alumnos de DAM en la materia Programación: ");

      System.out.println("¿Cuantos alumnos hay en la clase?");
      int alumnosClase = sc.nextInt();
      sc.nextLine();

      String[] nombres = new String[alumnosClase];
      double[][] notas = new double[alumnosClase][3];

      for (int i = 0; i < nombres.length; i++) {
         System.out.println("Introduce el nombre del " + (i + 1) + " alumno de clase");
         nombres[i] = sc.nextLine();

         for (int j = 0; j < notas[i].length; j++) {
            System.out.println("Introduce la nota de la " + (j + 1) + " evaulacion para " + nombres[i] + ":");
            notas[i][j] = sc.nextDouble();
         }
         sc.nextLine();
      }

      int opcionElegida;
      while (true) {
         mostrarMenu();
         opcionElegida = sc.nextInt();
         if (opcionElegida == 5) {
            System.out.println();
            System.out.println("Saliendo del programa...");
            sc.close();
            break;
         } else if (opcionElegida == 1) {
            mostrarNotasAlumno(nombres, notas);
         } else if (opcionElegida == 2) {
            mostrarTodasNotasAlumnos(nombres, notas);
         } else if (opcionElegida == 3) {
            calcularMedias(notas);
         } else if (opcionElegida == 4) {
            notasMinMax(nombres, notas);
         } else {
            System.out.println();
            System.out.println("\u001B[31mERROR: Opción no válida. Intentalo de nuevo\u001B[0m");
         }
      }
   }
}
