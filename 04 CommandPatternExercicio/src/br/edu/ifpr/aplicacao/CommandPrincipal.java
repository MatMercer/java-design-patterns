/*
 * Exercício: Command.
 * Converter esta aplicação para que faça uso do padrão de projetos Command e
 * Factory Method realizando quaisquer modificações no projeto e na aplicação
 * que sejam necessárias.
 */

package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class CommandPrincipal {
   private void lancarCtasReceber() {
      System.out.println("Lancando no Contas a Receber.");
   } // private void lancarCtasReceber()

   private void baixarCtasReceber() {
      System.out.println("Realizando baixa no Contas a Receber.");
   } // private void baixarCtasReceber()

   private void extornarCtasReceber() {
      System.out.println("Extornando lancamento do Contas a Receber.");
   } // private void extornarCtasReceber()

   private void gerarRemessaCtasReceber() {
      System.out.println("Gerando arquivo de Remessa do Contas a Receber.");
   } // private void gerarRemessaCtasReceber()

   public CommandPrincipal() {
      int processamento = 1;

      switch (processamento) {
         case 1 : lancarCtasReceber();       break;
         case 2 : baixarCtasReceber();       break;
         case 3 : extornarCtasReceber();     break;
         case 4 : gerarRemessaCtasReceber();
      } // switch (processamento)
   } // public CommandPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new CommandPrincipal(); }
} // public class CommandPrincipal
