/*
 * Exercício: Strategy.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.util.BubbleSort;
import br.edu.ifpr.util.QuickSort;

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
      int   ordenacao = 2;

      System.out.println("==> Antes da classificacao");
      mostrar(valores);
      switch (ordenacao) {
         case 1 : {
            BubbleSort bs = new BubbleSort();
            bs.sort(valores);
            break;
         }
         case 2: {
            QuickSort qs = new QuickSort();
            qs.sort(valores);
            break;
         }
      } // switch (ordenacao)
      System.out.println("==> Depois da classificacao");
      mostrar(valores);
   } // public StrategyPrincipal()
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) { new StrategyPrincipal(); }
} // public class StrategyPrincipal
