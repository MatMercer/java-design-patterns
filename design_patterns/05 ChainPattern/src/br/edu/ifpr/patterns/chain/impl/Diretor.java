package br.edu.ifpr.patterns.chain.impl;

import br.edu.ifpr.modelo.Compra;
import br.edu.ifpr.patterns.chain.Aprovador;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Diretor extends Aprovador {
   @Override
   public void processarRequisicao(Compra compra) {
      if (compra.getQtde() < 50000.0)
         System.out.println(this.getClass().getSimpleName() + " aprovou " +
                            "compra No. " + compra.getNumero());
      else
         System.out.println("Compra muita alta.");
   } // public void processarRequisicao(Compra)
} // public class Diretor extends Aprovador
