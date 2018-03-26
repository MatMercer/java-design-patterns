package br.edu.ifpr.patterns.impl;

import br.edu.ifpr.patterns.state.State;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DesligadoState extends State {
   @Override
    public void trocar(Encadeamento en) {
       en.setState(new BaixoState());
       System.out.println("velocidade baixa");
   } // public void trocar(Encadeamento)
} // public class DesligadoState extends State
