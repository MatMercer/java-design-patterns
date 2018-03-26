/*
 * Classe principal para a aplicação de teste do padrão de projeto Singleton.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.singleton.SystemConfig;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class SingletonPrincipal {
   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) {
      SystemConfig systemConfig = SystemConfig.getInstance();
      
      System.out.println("Usuario..: " + systemConfig.getUserName());
      System.out.println("Usuario..: " +
                                      SystemConfig.getInstance().getUserName());
      System.out.println("Dir Raiz.: " + systemConfig.getUserHome());
      System.out.println("Dir Atual: " + systemConfig.getUserDir());
   } // public static void main(String[])
} // public class SingletonPrincipal
