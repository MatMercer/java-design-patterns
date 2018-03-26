package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.impl.Encadeamento;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class StatePrincipal {
   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) throws IOException {
      InputStreamReader is = new InputStreamReader(System.in);

      Encadeamento encadeamento = new Encadeamento();
      while (true) {
         System.out.print("Pressione 'Enter' para executar ou " +
                          "'Q' seguido de 'Enter' para sair ");
         int ch = is.read();
         if (ch == 'Q' || ch == 'q') break;
         encadeamento.trocar();
      } // while (true)
   } // public static void main(String[]) throws IOException
} // public class StatePrincipal
