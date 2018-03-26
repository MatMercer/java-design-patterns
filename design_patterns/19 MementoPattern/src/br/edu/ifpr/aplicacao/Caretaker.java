package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.memento.Memento;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Caretaker {
   private Memento memento;

   public void    setMemento(Memento memento) { this.memento = memento; }
   public Memento getMemento() { return memento; }
} // public class Caretaker
