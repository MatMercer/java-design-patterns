/*
 * Exercício: Prototype.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Pessoa;

/**
 *
 * @author 
 */
public class PrototypePrincipal {
   public PrototypePrincipal() {
      Pessoa p1 = new Pessoa(1,"Maga Patalógica");
      System.out.println("p1: " + p1);
      Pessoa p2 = new Pessoa(p1);
      System.out.println("p2: " + p2);
      p1.setNome("Maga Patalógica de Patópolis");
      System.out.println("p1: " + p1);
      System.out.println("p2: " + p2);
   } // public PrototypePrincipal()

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new PrototypePrincipal(); }
} // public class PrototypePrincipal
