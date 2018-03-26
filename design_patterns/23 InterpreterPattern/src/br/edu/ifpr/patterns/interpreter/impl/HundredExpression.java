package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.Expression;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class HundredExpression extends Expression {
   @Override
   public String one() { return "C"; }
   @Override
   public String four(){ return "CD"; }
   @Override
   public String five(){ return "D"; }
   @Override
   public String nine(){ return "CM"; }
   @Override
   public int multiplier() { return 100; }
} // public class HundredExpression extends Expression
