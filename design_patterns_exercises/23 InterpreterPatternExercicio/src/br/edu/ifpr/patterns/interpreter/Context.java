package br.edu.ifpr.patterns.interpreter;

import br.edu.ifpr.patterns.interpreter.impl.VariableExpression;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Context {
   private String  xName, yName;
   private boolean xValue, yValue;

   /**
    * Recebe o nome da variável e, caso a encontre, retorna seu valor. Caso
    * contrário, deve retornar o valor falso.
    * 
    * @param name
    * 
    * @return o valor correspondente à variavel recebida.
    */
   public boolean lookup(String name) {
      return false;
   } // public boolean lookup(String)

   /**
    * Associa a variável X juntamente com seu valor.
    * 
    * @param ve Variável representada por X.
    * 
    * @param value O valor lógica da variável X.
    */
   public void assignX(VariableExpression ve, boolean value) {
   } // public void assignX(VariableExpression, boolean)

   /**
    * Associa a variável Y juntamente com seu valor.
    * 
    * @param ve Variável representada por Y.
    * 
    * @param value O valor lógica da variável Y.
    */
   public void assignY(VariableExpression ve, boolean value) {
   } // public void assignY(VariableExpression, boolean)
} // public class Context
