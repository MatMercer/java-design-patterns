package br.edu.ifpr.patterns.impl;

import br.edu.ifpr.patterns.state.State;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Encadeamento {
    private State atual;

    public Encadeamento() { atual = new DesligadoState(); }
    public void setState(State s) { atual = s; }
    public void trocar() { atual.trocar(this); }
} // public class Encadeamento
