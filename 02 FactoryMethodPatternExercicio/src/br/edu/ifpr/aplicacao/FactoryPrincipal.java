/*
 * Exercício: Factory Method.
 * Converter esta aplicação para que faça uso do padrão de projetos Factory
 * Method, realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.*;
import br.edu.ifpr.patterns.factory.PessoaFactory;

/**
 *
 * @author 
 */
public class FactoryPrincipal {
   public FactoryPrincipal() {
      Pessoa p = PessoaFactory.getPessoa(PessoaEnum.PROFESSOR);

      if (p != null)
         System.out.println(p.getClass().getSimpleName() + ": " + p);
   } // public FactoryPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new FactoryPrincipal(); }
} // public class FactoryPrincipal
