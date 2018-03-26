/*
 * Exercício: Interpreter.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.interpreter.BooleanExpression;
import br.edu.ifpr.patterns.interpreter.Context;
import br.edu.ifpr.patterns.interpreter.impl.AndExpression;
import br.edu.ifpr.patterns.interpreter.impl.ConstantExpression;
import br.edu.ifpr.patterns.interpreter.impl.NotExpression;
import br.edu.ifpr.patterns.interpreter.impl.OrExpression;
import br.edu.ifpr.patterns.interpreter.impl.VariableExpression;

/**
 *
 * @author 
 */
public class InterpreterPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       // Implementar um analisador de expressões lógicas utilizando o padrão
       // de projetos Interpreter.
       // As classes necessárias a este analisador estão prontas aguardando
       // que as suas lógicas sejam implementadas.
       // Este método atua como o objeto Interpreter invocando as operações e
       // processando seu resultado.
       BooleanExpression expression;

       VariableExpression x = new VariableExpression("X");
       VariableExpression y = new VariableExpression("Y");

       expression = new OrExpression(
                              new AndExpression(new ConstantExpression(true),x),
                                     new AndExpression(y,new NotExpression(x)));
       Context context = new Context();
       context.assignX(x,true);
       context.assignY(y,false);

       System.out.println("Resultado: " + expression.evaluate(context));
    } // public static void main(String[])
} // public class InterpreterPrincipal
