package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.template.Venda;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VendaSC extends Venda {
   @Override
   public void calcularICMS() { icms = 0.15; }
} // public class VendaSC extends Venda
