package Unidad1.Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        // Escribe un programa que permita a un estudiante saber cuál será su nota media en cada una las tres
        // materias que cursa y la nota media global

        double examenMate1;
        double examenMate2;
        double examenFisica1;
        double examenFisica2;
        double examenQuimica1;
        double examenQuimica2;
        double tareasRealizadasMate = 3;
        double tareasRealizadasFisica = 2;
        double tareasRealizadasQuimica = 3;
        double tareasTotalesMate;
        double tareasTotalesFisica;
        double tareasTotalesQuímica;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota de examen mate 1: ");
        examenMate1 = sc.nextDouble();
        System.out.println("Nota de examen mate 2: ");
        examenMate2 = sc.nextDouble();
        System.out.println(("Tareas totales mate: "));
        tareasTotalesMate = sc.nextDouble();
        System.out.println("Nota de examen física 1: ");
        examenFisica1 = sc.nextDouble();
        System.out.println("Nota de examen física 2: ");
        examenFisica2 = sc.nextDouble();
        System.out.println(("Tareas totales física: "));
        tareasTotalesFisica = sc.nextDouble();
        System.out.println("Nota de examen química 1: ");
        examenQuimica1 = sc.nextDouble();
        System.out.println("Nota de examen química 2: ");
        examenQuimica2 = sc.nextDouble();
        System.out.println(("Tareas totales química: "));
        tareasTotalesQuímica = sc.nextDouble();

        double notaExamenesMate = 0.9 * ((examenMate1 + examenMate2) / 2);
        double notaExamenesFisica = 0.9 * ((examenFisica1 + examenFisica2) / 2);
        double notaExamenesQuímica = 0.9 * ((examenQuimica1 + examenQuimica2) / 2);

        double notaTareasMate = 0.1 * (tareasRealizadasMate / tareasTotalesMate);
        double notaTareasFisica = 0.2 * (tareasRealizadasFisica / tareasTotalesFisica);
        double notaTareasQuímica = 0.15 * (tareasRealizadasQuimica / tareasTotalesQuímica);

        double notaGlobalMate = notaExamenesMate + notaTareasMate;
        double notaGlobalFisica = notaExamenesFisica + notaTareasFisica;
        double notaGlobalQuimica = notaExamenesQuímica + notaTareasQuímica;

        double notaGlobal = (notaGlobalMate + notaGlobalFisica + notaGlobalQuimica) / 3;

        System.out.printf("La nota de mate es un %.2f\n", notaGlobalMate);
        System.out.printf("La nota de física es un %.2f\n", notaGlobalFisica);
        System.out.printf("La nota de química es un %.2f\n", notaGlobalQuimica);
        System.out.printf("La nota global es un %.2f", notaGlobal);

        sc.close();
    }
}
