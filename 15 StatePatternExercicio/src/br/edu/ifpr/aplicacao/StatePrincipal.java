/*
 * Exercício: State.
 * Converter esta aplicação para que faça uso do padrão de projetos State
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Ventilador;

/**
 *
 * @author 
 */
public class StatePrincipal {
   public StatePrincipal() {
      Ventilador ventilador = new Ventilador();

      long inicio = System.currentTimeMillis();
      long tempo = 0L;
      do {
         ventilador.trocar();
         tempo = System.currentTimeMillis();
      } while ((inicio + 2000L) > tempo);
   } // public StatePrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new StatePrincipal(); }
} // public class StatePrincipal
