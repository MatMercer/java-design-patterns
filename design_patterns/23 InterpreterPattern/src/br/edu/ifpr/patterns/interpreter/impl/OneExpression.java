package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.Expression;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class OneExpression extends Expression {
   @Override
   public String one() { return "I"; }
   @Override
   public String four(){ return "IV"; }
   @Override
   public String five(){ return "V"; }
   @Override
   public String nine(){ return "IX"; }
   @Override
   public int multiplier() { return 1; }
} // public class OneExpression extends Expression
