package br.edu.ifpr.patterns.chain;

import br.edu.ifpr.modelo.Compra;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Aprovador {
   protected Aprovador proximo;

   public void setProximo(Aprovador proximo) { this.proximo = proximo; }

   public abstract void processarRequisicao(Compra compra);
} // public abstract class Aprovador
