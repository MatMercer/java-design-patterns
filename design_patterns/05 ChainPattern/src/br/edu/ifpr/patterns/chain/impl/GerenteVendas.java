package br.edu.ifpr.patterns.chain.impl;

import br.edu.ifpr.modelo.Compra;
import br.edu.ifpr.patterns.chain.Aprovador;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class GerenteVendas extends Aprovador {
   @Override
   public void processarRequisicao(Compra compra) {
      if (compra.getQtde() < 15000.0)
         System.out.println(this.getClass().getSimpleName() + " aprovou " +
                            "compra No. " + compra.getNumero());
      else
         if (proximo != null)
            proximo.processarRequisicao(compra);
   } // public void processarRequisicao(Compra)
} // public class GerenteVendas extends Aprovador
