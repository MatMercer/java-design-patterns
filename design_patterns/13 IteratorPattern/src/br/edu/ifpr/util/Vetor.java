package br.edu.ifpr.util;

import br.edu.ifpr.patterns.iterator.IteratorGOF;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Vetor {
   private static final int DEFAULT_SIZE = 16;

   private Object[] valores;
   private int      total_geral, total_atual;
   private int      atual;

   public Vetor() { this(DEFAULT_SIZE); }
   public Vetor(int size) {
      atual       = 0;
      total_atual = 0;
      total_geral = size;
      valores     = new Object[total_geral];
   } // public Vetor()

   public void add(Object obj) {
      if (atual >= total_geral) {
         total_geral += DEFAULT_SIZE;
         Object[] temp = new Object[total_geral];
         System.arraycopy(valores,0,temp,0,valores.length);
         valores = temp;
      } // if (atual >= total_geral)
      valores[atual++] = obj;
      ++total_atual;
   } // public void add(Object)
   
   public IteratorGOF createIterator() { return new VetorIterator(); }

   private class VetorIterator implements IteratorGOF {
      private int indice = Integer.MAX_VALUE;

      @Override
      public Object first() { indice = 0; return next(); }

      @Override
      public Object next() { return valores[indice++]; }

      @Override
      public boolean isDone() { return indice > total_atual; }
   } // private class VetorIterator implements IteratorGOF
} // public class Vetor
