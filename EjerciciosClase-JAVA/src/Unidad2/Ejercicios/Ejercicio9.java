package Unidad2.Ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    // Crea un método que acepte un número entero que represente un día de la semana y retorne una
    // cadena que represente el nombre de ese día. Si el método recibe un número que no representa un día
    // de la semana, retornará un valor que indique el error.
    // A continuación, escribe un programa que haga uso de este método para permitir que un usuario
    // obtenga nombres de días de la semana introduciendo por teclado los números correspondientes. Si
    // introduce un número no válido, el programa deberá mostrar el número de datos erróneos introducidos
    // hasta ese momento

    static String diaSemana (int numDia) {
        String dia = "";
        if (numDia < 1 || numDia > 7){
            return null;
        } else if (numDia == 1){
            dia = "Lunes";
        } else if (numDia == 2){
            dia = "Martes";
        } else if (numDia == 3){
            dia = "Miercoles";
        } else if (numDia == 4){
            dia = "Jueves";
        } else if (numDia == 5){
            dia = "Viernes";
        } else if (numDia == 6){
            dia = "Sabado";
        } else if (numDia == 7){
            dia = "Domingo";
        }

        return String.format("El día %d de la semana es el %s", numDia, dia);
    }

    public static void main(String[] args){
        int contadorFallos = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Introduce el numero de un dia de la semana: ");
            int numDia = sc.nextInt();
            System.out.println(diaSemana(numDia));
            if (numDia < 1 || numDia > 7) {
                contadorFallos++;
                if (contadorFallos == 1) {
                    System.out.println("Se ha registrado 1 fallo");
                } else if (contadorFallos > 1 && contadorFallos < 10){
                    System.out.println("Se han registrado " + contadorFallos + " fallos");
                } else {
                    System.out.println("Has llegado a " + contadorFallos + " fallos");
                    System.out.println("¿Deseas finalizar el programa? (1: SÍ, Otro num para seguir)");
                    int opcionElegida = sc.nextInt();
                    if (opcionElegida == 1) {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
