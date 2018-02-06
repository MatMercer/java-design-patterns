/*
 * Exercício: Abstract Factory.
 * Converter esta aplicação para que faça uso do padrão de projetos Abstract
 * Factory e Factory Method, realizando quaisquer modificações no projeto e na
 * aplicação que sejam necessárias.
 */

package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class AbstractFactoryPrincipal {
   private void processarWindows() {
      Botao botao = new BotaoWindows();
      botao.desenhar();
   } // private void processarWindows()

   private void processarGtk() {
      Botao botao = new BotaoGtk();
      botao.desenhar();
   } // private void processarGtk()

   private void processarMacintoch() {
      Botao botao = new BotaoMacintoch();
      botao.desenhar();
   } // private void processarMacintoch()

   public AbstractFactoryPrincipal() {
      int ambienteGrafico = 1;

      switch (ambienteGrafico) {
         case 1 : processarWindows();   break;
         case 2 : processarGtk();       break;
         case 3 : processarMacintoch();
      } // switch (ambienteGrafico)
   } // public AbstractFactoryPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new AbstractFactoryPrincipal(); }
} // public class AbstractFactoryPrincipal
