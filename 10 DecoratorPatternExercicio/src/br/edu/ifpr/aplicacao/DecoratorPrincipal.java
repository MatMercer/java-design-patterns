/*
 * Exercício: Decorator.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class DecoratorPrincipal {
   public DecoratorPrincipal() {
      System.out.println("Comportamento especifico A");
      if (2 > 1)
         System.out.println("2 > 1");
      System.out.println("Comportamento especifico B");
      if (2 > 3)
         System.out.println("2 > 3");
      System.out.println("Comportamento especifico C");
   } // public DecoratorPrincipal()

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new DecoratorPrincipal(); }
} // public class DecoratorPrincipal
