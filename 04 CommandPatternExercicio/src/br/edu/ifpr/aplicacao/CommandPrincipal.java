/*
 * Exercício: Command.
 * Converter esta aplicação para que faça uso do padrão de projetos Command e
 * Factory Method realizando quaisquer modificações no projeto e na aplicação
 * que sejam necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.command.factory.CommandFactory;
import br.edu.ifpr.patterns.command.invoker.Invoker;

/**
 *
 * @author 
 */
public class CommandPrincipal {
   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) {
      Invoker invoker = new Invoker(CommandFactory.CommandType.LANCAR_CTAS_RECEBER);

      invoker.getCmd().execute();

      invoker.setCmd(CommandFactory.CommandType.BAIXAR_CTAS_RECEBER);

      invoker.getCmd().execute();
   }
} // public class CommandPrincipal
