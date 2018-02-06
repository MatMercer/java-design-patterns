/*
 * Exercício: Chain of Responsibility.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class ChainPrincipal {
   public ChainPrincipal() {
      int condicao = 1;

      switch (condicao) {
         case 1 : System.out.println("Processamento UM");     break;
         case 2 : System.out.println("Processamento DOIS");   break;
         case 3 : System.out.println("Processamento TRES");   break;
         case 4 : System.out.println("Processamento QUATRO"); break;
      } // switch (condicao)
   } // public ChainPrincipal()

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new ChainPrincipal(); }
} // public class ChainPrincipal
