package Unidad4.CreacionClases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hucha {
   Scanner sc = new Scanner(System.in);
   
   private int cantidadDinero;
   private int monedas1Euro;
   private int monedas2Euros;
   private int billetes5Euros;
   private int billetes10Euros;
   private int billetes20Euros;
   private int billetes50Euros;
   private String contraseña;
   private boolean estaAbierta = false;

   public Hucha () {}

   public Hucha (int monedas1Euro, int monedas2Euros, int billetes5Euros, int billetes10Euros, int billetes20Euros, int billetes50Euros) {
      this.monedas1Euro = monedas1Euro;
      this.monedas2Euros = monedas2Euros;
      this.billetes5Euros = billetes5Euros;
      this.billetes10Euros = billetes10Euros;
      this.billetes20Euros = billetes20Euros;
      this.billetes50Euros = billetes50Euros;
      this.cantidadDinero = (billetes50Euros * 50) + (billetes20Euros * 20) + (billetes10Euros * 10) + (billetes5Euros * 5) + (monedas2Euros * 2) + (monedas1Euro * 1);
   }
   
   public Hucha (int cantidadDinero) {
      this.cantidadDinero = cantidadDinero;
      desglosarCantidad(cantidadDinero);
   }

   public void desglosarCantidad (int cantidad) {
      int[] valores = {50, 20, 10, 5, 2, 1};
      int[] cantidades = new int[valores.length];

      for (int i = 0; i < valores.length; i++) {
         cantidades[i] = cantidad / valores[i];
         cantidad %= valores[i]; 
      }

      this.billetes50Euros = cantidades[0];
      this.billetes20Euros = cantidades[1];
      this.billetes10Euros = cantidades[2];
      this.billetes5Euros = cantidades[3];
      this.monedas2Euros = cantidades[4];
      this.monedas1Euro = cantidades[5];
   }
   
   public int getMonedas1Euro() {
      if (estaAbierta) {
         return monedas1Euro;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }

   public int getMonedas2Euros() {
      if (estaAbierta) {
         return monedas2Euros;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }

   public int getBilletes5Euros() {
      if (estaAbierta) {
         return billetes5Euros;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }

   public int getBilletes10Euros() {
      if (estaAbierta) {
         return billetes10Euros;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }

   public int getBilletes20Euros() {
      if (estaAbierta) {
         return billetes20Euros;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }

   public int getBilletes50Euros() {
      if (estaAbierta) {
         return billetes50Euros;
      } else {
         System.out.println("La hucha está cerrada");
         return 0;
      }
   }


   public boolean validarContraseña (String nuevaContraseña) {
      boolean esValida = false;
      String regexContraseña = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
      Pattern pattern = Pattern.compile(regexContraseña);
      Matcher m = pattern.matcher(nuevaContraseña);
      if (m.find()) {
         esValida = true;
      }
      return esValida;
   }

   public void setContraseña (String contraseña) {
      do {
         if (this.validarContraseña(contraseña)) {
            System.out.println("Contraseña válida segun nuestros criterios. Contraseña actualizada.");
            this.contraseña = contraseña;
            return;
         }
         System.out.println("Contraseña no válida, escribe una contraseña correcta: ");
         contraseña = sc.next();
      } while (true);
   }

   public String getContraseña () {
      if (contraseña == null) {
         return "No hay contraseña";
      }
      System.out.println("Preguntando al dueño...");
      return "La contraseña es " + this.contraseña;
   } 

   public void abrir () {
      if (estaAbierta) {
         System.out.println("La hucha ya está abierta");
         return;
      }
      
      if (this.contraseña == null) {
         System.out.println("Necesitas una contraseña para abrir la hucha.");
         System.out.println("Introduce una nueva contraseña: ");
         String nuevaContraseña = sc.next();
         setContraseña(nuevaContraseña);
      } 

      System.out.println("Introduce la contraseña para abrir la hucha: ");
      String contraseñaIntroducida = sc.next();
      do {
         if (contraseñaIntroducida.equals(this.contraseña)) {
            System.out.println("Hucha abierta");
            this.estaAbierta = true;
            return;
         } 
         System.out.println("Contraseña incorrecta, vuelve a intentarlo: ");
         contraseñaIntroducida = sc.next();
      } while (true);
   }

   public void cerrar () {
      if (estaAbierta) {
         System.out.println("Hucha cerrada");
         this.estaAbierta = false;
      } else {
         System.out.println("La hucha ya está cerrada");
      }
   }

   public int getCantidadDinero () {
      if (estaAbierta) {
         return this.cantidadDinero;
      } else {
         System.out.println("La hucha esta cerrada");
         return 0;
      }
   }

   public int getCantidadBilletes () {
      if (estaAbierta) {
         int[] billetes = {this.billetes5Euros,this.billetes10Euros,this.billetes20Euros,this.billetes50Euros};
         int cantidadBilletes = 0;
         for (int i = 0; i < billetes.length; i++) {
            cantidadBilletes += billetes[i];
         }
         return cantidadBilletes;
      } else {
         System.out.println("La hucha esta cerrada");
         return 0;
      }
   }

   public int getCantidadMonedas () {
      if (estaAbierta) {
         int[] monedas = {this.monedas1Euro,this.monedas2Euros};
         int cantidadMonedas = 0;
         for (int i = 0; i < monedas.length; i++) {
            cantidadMonedas += monedas[i];
         }
         return cantidadMonedas;
      } else {
         System.out.println("La hucha esta cerrada");
         return 0;
      }
   }

   public String getEstaAbierta () {
      if (estaAbierta) {
         return "La hucha esta abierta";
      }
      return "La hucha esta cerrada";
   }

   @Override
   public String toString() {
      if (estaAbierta) {
         return "La hucha contiene " + this.cantidadDinero + " euro" + (this.cantidadDinero == 1 ? "" : "s") + " en total, hay " +
               this.getCantidadBilletes() + " billete" + (this.getCantidadBilletes() == 1 ? "" : "s") + " y " + 
               this.getCantidadMonedas() + " moneda" + (this.getCantidadMonedas() == 1 ? "" : "s") + " en total con " +
               monedas1Euro + " moneda" + (monedas1Euro == 1 ? "" : "s") + " de 1 euro, " + 
               monedas2Euros + " moneda" + (monedas2Euros == 1 ? "" : "s") + " de 2 euros, " + 
               billetes5Euros + " billete" + (billetes5Euros == 1 ? "" : "s") + " de 5 euros, " +
               billetes10Euros + " billete" + (billetes10Euros == 1 ? "" : "s") + " de 10 euros, " + 
               billetes20Euros + " billete" + (billetes20Euros == 1 ? "" : "s") + " de 20 euros, y " +
               billetes50Euros + " billete" + (billetes50Euros == 1 ? "" : "s") + " de 50 euros. ";
      }
      return "La hucha esta cerrada";
   }
}
