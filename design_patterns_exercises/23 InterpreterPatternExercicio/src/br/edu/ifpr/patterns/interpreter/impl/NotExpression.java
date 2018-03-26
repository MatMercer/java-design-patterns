package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.BooleanExpression;
import br.edu.ifpr.patterns.interpreter.Context;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class NotExpression extends BooleanExpression {
   private BooleanExpression op;

   public NotExpression(BooleanExpression op) {}

   /**
    * Realiza a operação lógica de negação (NOT).
    * 
    * @param context O contexto a ser passado para o método de avaliação.
    * 
    * @return retorna o valor lógica negado a partir da avaliação de "op".
    */
   @Override
   public boolean evaluate(Context context) { return false; }
} // public class NotExpression extends BooleanExpression
