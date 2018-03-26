package br.edu.ifpr.patterns.command.impl;

import br.edu.ifpr.patterns.command.Command;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CancelarVendaCommand implements Command {
   public void execute() {
      System.out.println("Devolvendo produtos ao estoque.");
      System.out.println("Alterado estado da Venda para 'Cancelado'.");
   }
} // public class CancelarVendaCommand implements Command
