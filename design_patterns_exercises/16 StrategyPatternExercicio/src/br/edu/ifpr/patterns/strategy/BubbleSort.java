package br.edu.ifpr.patterns.strategy;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class BubbleSort implements SortStrategy {
   public void sort(int[] dados) {
      for (int i = 0; i < (dados.length - 1); i++)
         for (int j = i + 1; j < dados.length; j++) {
            if (dados[i] > dados[j]) {
               int temp = dados[i];
               dados[i] = dados[j];
               dados[j] = temp;
            } // if (dados[i] < dados[j])
         } // for (int j = i + 1; j < dados.length; j++)
   } // public void sort(int[])
} // public class BubbleSort
