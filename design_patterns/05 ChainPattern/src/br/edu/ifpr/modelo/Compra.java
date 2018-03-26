package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Compra {
   private int    numero;
   private double qtde;

   public Compra(int numero, double qtde) {
      setNumero(numero);
      setQtde(qtde);
   } // public Compra(int, double)
   // setters
   public void setNumero(int numero) { this.numero = numero; }
   public void setQtde(double qtde) { this.qtde = qtde; }
   // getters
   public int    getNumero() { return numero; }
   public double getQtde() { return qtde; }
} // public class Compra
