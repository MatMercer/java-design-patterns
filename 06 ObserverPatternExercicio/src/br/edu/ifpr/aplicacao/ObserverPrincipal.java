/*
 * Exercício: Observer.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import java.io.File;

/**
 *
 * @author 
 */
public class ObserverPrincipal implements Runnable {
   private static String PROP_FILE = "/br/edu/utfpr/resource/dados.properties";
   private File propriedades;

   public ObserverPrincipal() {
      propriedades = new File(getClass().getResource(PROP_FILE).getFile());
      (new Thread(this)).start();
   } // public ObserverPrincipal()

   private void loadConfig() {
      System.out.println("Recarregando configuracoes...");
   } // private void loadConfig()

   @Override
   public void run() {
      loadConfig();
      long tamanho = propriedades.length();
      while (true) {
         if (tamanho != propriedades.length()) {
            loadConfig();
            tamanho = propriedades.length();
         } // if (tamanho != propriedades.length())
         try { Thread.sleep(500); }
         catch (InterruptedException ex) { ex.printStackTrace(); }
      } // while (true)
   }

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new ObserverPrincipal(); }
} // public class ObserverPrincipal implements Runnable
