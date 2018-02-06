/*
 * Exercício: Factory Method.
 * Converter esta aplicação para que faça uso do padrão de projetos Factory
 * Method, realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Aluno;
import br.edu.ifpr.modelo.Pessoa;
import br.edu.ifpr.modelo.Professor;
import br.edu.ifpr.modelo.Secretaria;

/**
 *
 * @author 
 */
public class FactoryPrincipal {
   public FactoryPrincipal() {
      Pessoa p          = null;
      int    tipoPessoa = 1;

      switch (tipoPessoa) {
         case 1 : p = new Professor(1,"Professors Pardal","Doutor");      break;
         case 2 : p = new Aluno(1,"Albert Einstein",1935);                break;
         case 3 : p = new Secretaria(1,"Ada Lovelace","Desenvolvimento");
      } // switch (tipoPessoa)
      if (p != null)
         System.out.println(p.getClass().getSimpleName() + ": " + p);
   } // public FactoryPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new FactoryPrincipal(); }
} // public class FactoryPrincipal
