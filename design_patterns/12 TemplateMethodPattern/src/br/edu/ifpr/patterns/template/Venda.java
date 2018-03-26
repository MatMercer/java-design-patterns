package br.edu.ifpr.patterns.template;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Venda {
   private   String estadoDestino;
   protected double icms;
   
   public Venda() {}
   
   public double getIcms() { return icms; }

   public void finalizarVenda() {
      // algum código necessário é finalização da venda, porém executado ANTES
      // do cálculo do ICMS.
      calcularICMS();
      // algum código necessário é finalização da venda, porém executado DEPOIS
      // do cálculo do ICMS.
   } // public void finalizarVenda()

   public abstract void calcularICMS();
} // public abstract class Venda
