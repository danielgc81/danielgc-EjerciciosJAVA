package Unidad2.Ejercicios;
import java.util.Date;

public class Ejercicio7 {
        // Crea un método que acepte tres números enteros que representen la hora, minutos y segundos de un
        // instante cualquiera. A partir de estos datos deberá retornar una cadena que contenga la hora
        // correspondiente al segundo siguiente con el formato “HH:MM:SS”.
        // Finalmente, escribe un programa que lo ponga a prueba, por ejemplo, mostrando un reloj digital que se
        // actualice cada segundo comenzando desde la hora en la que se inicia su ejecución

    static String actualizarHora(int h, int m, int s){
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            return null;
        } else {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }
        }
        return String.format("%2d:%2d:%2d", h, m, s);
    }

    public static void main(String[] args){

    }
}
