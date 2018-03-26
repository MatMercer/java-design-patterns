package br.edu.ifpr.patterns.prototype.impl;

import br.edu.ifpr.patterns.prototype.Alguem;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Fulano implements Alguem {
   @Override
   public Alguem duplicate() { return new Fulano(); }

   @Override
   public String toString() { return "Fulano"; }
} // public class Fulano implements Alguem
