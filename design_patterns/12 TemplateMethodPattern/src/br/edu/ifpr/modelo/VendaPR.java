package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.template.Venda;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VendaPR extends Venda {
   @Override
   public void calcularICMS() { icms = 0.1; }
} // public class VendaPR extends Venda
