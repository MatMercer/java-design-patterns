package br.edu.ifpr.modelo;

/**
 *
 * @author 
 */
public abstract class Cor {
   protected static int totalVermelho, totalAzul;

   public Cor() { totalVermelho = totalAzul = 0; }

   public static void mostrar() {
      System.out.println("Vermelhos " + totalVermelho);
      System.out.println("Azuis " + totalAzul);
   } // public static void mostrar()

   public abstract void totalizar();
   public abstract void chamar();
} // public abstract class Cor
