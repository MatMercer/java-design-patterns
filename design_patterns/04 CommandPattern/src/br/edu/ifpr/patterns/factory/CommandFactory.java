package br.edu.ifpr.patterns.factory;

import br.edu.ifpr.patterns.command.Command;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public interface CommandFactory {
   public static final String NOVA_VENDA      = "NovaVenda";
   public static final String APROVAR_VENDA   = "AprovarVenda";
   public static final String FINALIZAR_VENDA = "FinalizarVenda";
   public static final String CANCELAR_VENDA  = "CancelarVenda";

   public Command createCommandFactory(String command);
} // public interface CommandFactory
