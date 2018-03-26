/*
 * Exercício: Builder.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.builder.ComandoSql;
import br.edu.ifpr.patterns.builder.OperacaoSql;

import static java.lang.System.out;

/**
 *
 * @author 
 */
public class BuilderPrincipal {
   public BuilderPrincipal() {
       ComandoSql comandoSql = ComandoSql.builder().comando("Crazy").operacao(OperacaoSql.INSERT).build();

       out.println(comandoSql);
   } // public BuilderPrincipal()

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new BuilderPrincipal(); }
} // public class BuilderPrincipal
