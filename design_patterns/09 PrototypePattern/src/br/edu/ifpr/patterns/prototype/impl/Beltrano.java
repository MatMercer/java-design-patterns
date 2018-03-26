package br.edu.ifpr.patterns.prototype.impl;

import br.edu.ifpr.patterns.prototype.Alguem;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Beltrano implements Alguem {
   @Override
   public Alguem duplicate() { return new Beltrano(); }

   @Override
   public String toString() { return "Beltrano"; }
} // public class Beltrano implements Alguem
