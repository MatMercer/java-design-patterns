package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.interpreter.Context;
import br.edu.ifpr.patterns.interpreter.Expression;
import br.edu.ifpr.patterns.interpreter.impl.HundredExpression;
import br.edu.ifpr.patterns.interpreter.impl.OneExpression;
import br.edu.ifpr.patterns.interpreter.impl.TenExpression;
import br.edu.ifpr.patterns.interpreter.impl.ThousandExpression;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class InterpreterPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       String  roman   = "MMMCMXCVIII";
       Context context = new Context(roman);
       
       List<Expression> tree = new ArrayList<Expression>();
       tree.add(new ThousandExpression());
       tree.add(new HundredExpression());
       tree.add(new TenExpression());
       tree.add(new OneExpression());
       
       for (Expression e : tree)
          e.interpret(context);

       System.out.println(roman + " = " + context.getOut());
    } // public static void main(String[])
} // public class InterpreterPrincipal
