/*
 * Exercício: Abstract Factory.
 * Converter esta aplicação para que faça uso do padrão de projetos Abstract
 * Factory e Factory Method, realizando quaisquer modificações no projeto e na
 * aplicação que sejam necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.abstractfactory.AbstractFactory;
import br.edu.ifpr.patterns.abstractfactory.GtkFactory;

/**
 *
 * @author
 */
public class AbstractFactoryPrincipal {

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) {
      AbstractFactory factory = new GtkFactory();

      factory.criarBotao();
   }
} // public class AbstractFactoryPrincipal
