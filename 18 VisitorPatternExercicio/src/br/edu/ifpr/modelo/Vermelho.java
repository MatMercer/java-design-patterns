package br.edu.ifpr.modelo;

/**
 *
 * @author 
 */
public class Vermelho extends Cor {
   @Override
   public void totalizar() { ++totalVermelho; }

   @Override
   public void chamar() { olhos(); }

   public void olhos() { System.out.println("Olhos vermelhos."); }
} // public class Vermelho extends Cor
