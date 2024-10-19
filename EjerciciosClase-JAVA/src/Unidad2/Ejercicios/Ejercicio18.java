package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio18 {
    // Escribe un programa que ayude al aprendizaje de las tablas de multiplicar de la forma siguiente:
    //      • El programa preguntará qué tabla se desea repasar (número entre 1 y 9).
    //      • A continuación, preguntará el resultado de cada multiplicación de la tabla elegida,
    //        contabilizando cada fallo y mostrando la respuesta correcta.
    //      • Al completar la tabla, el programa le dirá al usuario si ha aprobado (menos de 2 fallos) o ha
    //        suspendido (2 o más fallos).
    //      • Después dará la opción de repasar otra tabla o salir del programa.

    static String tabla1 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("1 x " + i + " =");
            int operacion = 1 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla2 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " =");
            int operacion = 2 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla3 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " =");
            int operacion = 3 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla4 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("4 x " + i + " =");
            int operacion = 4 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla5 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " =");
            int operacion = 5 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla6 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("6 x " + i + " =");
            int operacion = 6 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla7 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " =");
            int operacion = 7 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla8 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " =");
            int operacion = 8 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static String tabla9 () {
        Scanner sc = new Scanner(System.in);
        int contadorFallos = 0;
        String respuesta = "";
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " =");
            int operacion = 9 * i;
            int num = sc.nextInt();
            if (num != operacion) {
                System.out.println("Incorrecto, la respuesta correcta es " + operacion);
                contadorFallos++;
            } else {
                System.out.println("Correcto!");
            }

            if (contadorFallos > 2) {
                respuesta = "Has suspendido!!";
            } else {
                respuesta = "Has aprobado!!";
            }
        }
        return respuesta;
    }

    static void elegirOpcion (){
        Scanner sc = new Scanner(System.in);
        int tabla;
        while (true){
            System.out.println("¿Que tabla deseas repasar? (1 al 9, 0: Salir)");
            tabla = sc.nextInt();

            if (tabla < 0 || tabla > 9) {
                System.out.println("Introduce una opción válida");
                System.out.println();
            } else if (tabla == 1){
                System.out.println("Has elegido la tabla del 1");
                System.out.println(tabla1());
                System.out.println();
            } else if (tabla == 2) {
                System.out.println("Has elegido la tabla del 2");
                System.out.println(tabla2());
                System.out.println();
            } else if (tabla == 3) {
                System.out.println("Has elegido la tabla del 3");
                System.out.println(tabla3());
                System.out.println();
            } else if (tabla == 4) {
                System.out.println("Has elegido la tabla del 4");
                System.out.println(tabla4());
                System.out.println();
            } else if (tabla == 5) {
                System.out.println("Has elegido la tabla del 5");
                System.out.println(tabla5());
                System.out.println();
            } else if (tabla == 6) {
                System.out.println("Has elegido la tabla del 6");
                System.out.println(tabla6());
                System.out.println();
            } else if (tabla == 7) {
                System.out.println("Has elegido la tabla del 7");
                System.out.println(tabla7());
                System.out.println();
            } else if (tabla == 8) {
                System.out.println("Has elegido la tabla del 8");
                System.out.println(tabla8());
                System.out.println();
            } else if (tabla == 9) {
                System.out.println("Has elegido la tabla del 9");
                System.out.println(tabla9());
                System.out.println();
            } else if (tabla == 0) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("MEMORIZATE LA TABLA DE MULTIPLICAR DEL 1 AL 9 CON ESTE PROGRAMA");
        elegirOpcion();
    }
}
