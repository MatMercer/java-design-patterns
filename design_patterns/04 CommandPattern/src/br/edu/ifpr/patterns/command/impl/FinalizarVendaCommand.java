package br.edu.ifpr.patterns.command.impl;

import br.edu.ifpr.patterns.command.Command;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FinalizarVendaCommand implements Command {
   public void execute() {
      System.out.println("Finalizando venda.");
   }
} // public class FinalizarVendaCommand implements Command
