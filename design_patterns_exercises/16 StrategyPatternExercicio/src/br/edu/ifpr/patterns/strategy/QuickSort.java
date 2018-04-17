package br.edu.ifpr.patterns.strategy;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class QuickSort implements SortStrategy {
   private void quicksort(int[] valores, int inicio, int fim) {
      int i = 0,
          j = fim,
          v = valores[(inicio + fim) / 2];

      do {
         while (valores[i] < v) i++;
         while (valores[j] > v) --j;
         if (i <= j) {
            int temp = valores[i];
            valores[i] = valores[j];
            valores[j] = temp;
            ++i; --j;
         } // if (i <= j)
      } while (i <= j);
      if (inicio < j) quicksort(valores,inicio,j);
      if (i != fim) quicksort(valores,i,fim);
   } // private void quicksort(int[], int, int)

   public void sort(int[] valores) { quicksort(valores,0,valores.length - 1); }
} // public class QuickSort
