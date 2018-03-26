package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.BooleanExpression;
import br.edu.ifpr.patterns.interpreter.Context;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class OrExpression extends BooleanExpression {
   private BooleanExpression op1;
   private BooleanExpression op2;

   public OrExpression(BooleanExpression op1, BooleanExpression op2) {
   } // public OrExpression(BooleanExpression, BooleanExpression)

   /**
    * Retorna a operação lógica OR de acordo com a avaliação de "op1" e "op2".
    * 
    * @param context O contexto a ser passado para o método de avaliação.
    * 
    * @return O valor da operação lógica OR sobre "op1" e "op2".
    */
   @Override
   public boolean evaluate(Context context) {
      return false;
   } // public boolean evaluate(Context)
} // public class OrExpression extends BooleanExpression
