package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.template.Venda;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VendaRS extends Venda {
   @Override
   public void calcularICMS() { icms = 0.2; }
} // public class VendaRS extends Venda
