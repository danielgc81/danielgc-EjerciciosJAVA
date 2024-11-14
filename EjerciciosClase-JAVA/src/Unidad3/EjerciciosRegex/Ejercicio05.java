package Unidad3.EjerciciosRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio05 {
   public static void main(String[] args) throws MalformedURLException, IOException {
      String regex = "^((https?://(www.)?)|www.)[a-z0-9]{3,67}.[a-z]{2,3}$";
      Pattern pattern = Pattern.compile(regex);
      try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("URL: ");
			@SuppressWarnings("deprecation")
         URL url = new URL(in.readLine());	
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			try (Scanner s = new Scanner(con.getInputStream())) {
            String linea;
            boolean urlsEncontradas = false;
				while ((linea = in.readLine()) != null) {
               Matcher m = pattern.matcher(linea);
               while (m.find()) {
                  System.out.println(m.group());
                  urlsEncontradas = true;
               }
            }
            if (!urlsEncontradas) {
               System.out.println("No se encontraron URLs");
            }
			} 
		}
   }
}
