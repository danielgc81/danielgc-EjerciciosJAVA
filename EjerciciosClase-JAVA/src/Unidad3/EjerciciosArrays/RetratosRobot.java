package Unidad3.EjerciciosArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetratosRobot {
   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static String [][] opciones = {
      {"el pelo", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||"},
      {"los ojos", "|  o o  |", "| (· ·) |", "| (O O) |", "| \\   / |"},
      {"la nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
      {"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
      {"la barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	public static void main(String[] args) throws IOException {
		System.out.print("Crear retrato Robot (s/n) : ");
		String respuesta = in.readLine();
		while (respuesta.equalsIgnoreCase("s")) {
			crearRetrato();
			System.out.print("Crear retrato Robot (s/n) : ");
			respuesta = in.readLine();
		}
	}
	
	public static void crearRetrato() throws IOException {
		String [] retrato = new String[opciones.length];
		for (int i=0; i<opciones.length; i++)
			retrato[i] = elegirOpcion(i);
		for (int i=0; i<opciones.length; i++)
			System.out.println(retrato[i]);
	}
	
	public static String elegirOpcion(int i) throws IOException {
      int op = 0;
      do {
         System.out.println("Elige una opcion para " + opciones[i][0]);
         for (int f = 1; f < opciones[i].length; f++) {
            System.out.println(f + " - " + opciones[i][f]);
         }

            System.out.println("Elige una opción:");
            op = Integer.parseInt(in.readLine());
            return opciones[i][op];
      } while (op < 1 || op > 4);
	}
}
