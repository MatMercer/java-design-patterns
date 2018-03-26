package br.edu.ifpr.patterns.command.impl;

import br.edu.ifpr.patterns.command.Command;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class AprovarVendaCommand implements Command {
   public void execute() {
      System.out.println("Verificando credito do cliente.");
   }
} // public class AprovarVendaCommand implements Command
