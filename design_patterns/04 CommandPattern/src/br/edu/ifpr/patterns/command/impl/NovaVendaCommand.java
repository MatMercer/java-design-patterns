package br.edu.ifpr.patterns.command.impl;

import br.edu.ifpr.patterns.command.Command;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class NovaVendaCommand implements Command {
   public void execute() {
      System.out.println("Iniciando venda.");
   }
} // public class NovaVendaCommand implements Command
