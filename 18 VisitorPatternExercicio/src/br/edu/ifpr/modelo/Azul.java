package br.edu.ifpr.modelo;

/**
 *
 * @author 
 */
public class Azul extends Cor {
   @Override
   public void totalizar() { ++totalAzul; }

   @Override
   public void chamar() { ceu(); }

   public void ceu() { System.out.println("Ceu azul."); }
} // public class Azul extends Cor
