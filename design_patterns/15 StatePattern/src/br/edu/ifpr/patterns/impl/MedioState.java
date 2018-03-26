package br.edu.ifpr.patterns.impl;

import br.edu.ifpr.patterns.state.State;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class MedioState extends State {
   @Override
    public void trocar(Encadeamento en) {
       en.setState(new AltoState());
       System.out.println("velocidade alta");
   } // public void trocar(Encadeamento)
} // public class MedioState extends State
