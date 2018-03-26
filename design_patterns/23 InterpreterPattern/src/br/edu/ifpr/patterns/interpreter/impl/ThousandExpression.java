package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.Expression;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ThousandExpression extends Expression {
   @Override
   public String one() { return "M"; }
   @Override
   public String four(){ return " "; }
   @Override
   public String five(){ return " "; }
   @Override
   public String nine(){ return " "; }
   @Override
   public int multiplier() { return 1000; }
} // public class ThousandExpression extends Expression
