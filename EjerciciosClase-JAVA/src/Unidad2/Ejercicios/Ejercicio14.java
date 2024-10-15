package Unidad2.Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        // Escribe un programa que lea las edades de varios alumnos y calcule los datos siguientes:
        //      • La suma de todas las edades.
        //      • La edad media.
        //      • El número de alumnos menores de edad.
        // Los resultados se mostrarán después de introducir el último dato y pulsar la combinación de teclas ctrl+d

        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0;
        double edadMedia = 0;
        int alumnosMenores = 0;

        System.out.println("¿Cuantos alumnos hay en la clase?");
        int numeroAlumnos = sc.nextInt();
        int i = 0;

        System.out.println("Introduce la edad del alumno:");
        while (i < numeroAlumnos) {
            double edadAlumno = sc.nextDouble();
            sumaEdades += edadAlumno;
            edadMedia = (double) sumaEdades / (double) numeroAlumnos;

            if (edadAlumno < 18){
                alumnosMenores++;
            }

            i++;
        }

        System.out.println("La suma de las edades del alumnado da " + sumaEdades);
        System.out.println("La media de las edades del alumnado da " + edadMedia);
        if (alumnosMenores == 1) {
            System.out.println("Hay 1 alumno menor de edad");
        } else {
            System.out.println("Hay " + alumnosMenores + " alumnos menores de edad");
        }
    }
}
