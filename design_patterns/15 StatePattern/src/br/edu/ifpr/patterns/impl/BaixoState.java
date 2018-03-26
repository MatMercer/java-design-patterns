package br.edu.ifpr.patterns.impl;

import br.edu.ifpr.patterns.state.State;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class BaixoState extends State {
   @Override
    public void trocar(Encadeamento en) {
       en.setState(new MedioState());
       System.out.println("velocidade media");
   } // public void trocar(Encadeamento)
} // public class BaixoState extends State
