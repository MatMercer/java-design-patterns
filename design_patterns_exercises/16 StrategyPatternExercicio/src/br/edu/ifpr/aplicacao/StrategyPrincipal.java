/*
 * Exercício: Strategy.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.strategy.BubbleSort;
import br.edu.ifpr.patterns.strategy.QuickSort;
import br.edu.ifpr.patterns.strategy.SortStrategy;

/**
 *
 * @author 
 */
public class StrategyPrincipal {
   private void mostrar(int[] valores) {
      for (int i = 0; i < valores.length; i++)
         System.out.println("[" + i + "]: " + valores[i]);
   } // private void mostrar(int[]

   public StrategyPrincipal() {
      int[] valores   = { 10, 123, 78, 459, 345, 34, 900, 54, 99, 1 };
      SortStrategy ordenacao = new QuickSort();

      System.out.println("==> Antes da classificacao");
      mostrar(valores);
      ordenacao.sort(valores);
      System.out.println("==> Depois da classificacao");
      mostrar(valores);
   } // public StrategyPrincipal()
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) { new StrategyPrincipal(); }
} // public class StrategyPrincipal
