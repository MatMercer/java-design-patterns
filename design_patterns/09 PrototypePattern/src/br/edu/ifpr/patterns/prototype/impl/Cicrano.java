package br.edu.ifpr.patterns.prototype.impl;

import br.edu.ifpr.patterns.prototype.Alguem;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Cicrano implements Alguem {
   @Override
   public Alguem duplicate() { return new Cicrano(); }

   @Override
   public String toString() { return "Cicrano"; }
} // public class Cicrano implements Alguem
