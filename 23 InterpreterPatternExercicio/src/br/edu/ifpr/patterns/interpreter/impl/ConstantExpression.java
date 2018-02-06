package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.BooleanExpression;
import br.edu.ifpr.patterns.interpreter.Context;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ConstantExpression extends BooleanExpression {
   private boolean op;

   public ConstantExpression(boolean op) {}

   /**
    * Avalia o valor da constante interna.
    * 
    * @param context Não utilizado, pois esta classe descreve uma constante.
    * 
    * @return O valor lógica da constante interna.
    */
   @Override
   public boolean evaluate(Context context) { return false; }
} // public class ConstantExpression extends BooleanExpression
