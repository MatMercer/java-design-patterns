package br.edu.ifpr.patterns.interpreter.impl;

import br.edu.ifpr.patterns.interpreter.BooleanExpression;
import br.edu.ifpr.patterns.interpreter.Context;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VariableExpression extends BooleanExpression {
   private String name;

   public VariableExpression(String name) {}

   public String getName() { return null; }

   /**
    * Recupera o valor lógica da variável cuja nome é passado ao método de
    * busca do objeto Context.
    * 
    * @param context Objeto sobre o qual o método de busca será invocado com o
    *                nome da variável.
    * 
    * @return Retorna o valor lógica da variável recebida como parâmetro.
    */
   @Override
   public boolean evaluate(Context context) { return false; }
} // public class VariableExpression extends BooleanExpression
