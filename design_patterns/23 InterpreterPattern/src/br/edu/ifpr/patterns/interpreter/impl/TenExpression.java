package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.Expression;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class TenExpression extends Expression {
   @Override
   public String one() { return "X"; }
   @Override
   public String four(){ return "XL"; }
   @Override
   public String five(){ return "L"; }
   @Override
   public String nine(){ return "XC"; }
   @Override
   public int multiplier() { return 10; }
} // public class TenExpression extends Expression
