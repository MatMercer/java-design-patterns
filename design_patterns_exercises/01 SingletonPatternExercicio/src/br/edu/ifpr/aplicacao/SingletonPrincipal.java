/*
 * Exercício: Singleton.
 * Converter esta aplicação para que faça uso do padrão de projetos Singleton
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.singleton.Presidencia;

/**
 *
 * @author 
 */
public class SingletonPrincipal {
   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) {
      Presidencia p1 = Presidencia.getInstance();
      p1.setNomePresidente("Thiago e seus Blue Caps");
      System.out.println("Presidente " + p1.getNomePresidente());

      Presidencia p2 = Presidencia.getInstance();
      p2.setNomePresidente("Adalberto Floyd");
      System.out.println("Presidente " + p2.getNomePresidente());

      System.out.println("Presidente " + p1.getNomePresidente());
   } // public static void main(String[])
} // public class SingletonPrincipal
