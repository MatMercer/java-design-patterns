package br.edu.ifpr.patterns.state;

import br.edu.ifpr.patterns.impl.DesligadoState;
import br.edu.ifpr.patterns.impl.Encadeamento;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class State {
   public void trocar(Encadeamento en) {
      en.setState(new DesligadoState());
      System.out.println("desligando");
   } // public void trocar(Encadeamento)
} // public abstract class State
