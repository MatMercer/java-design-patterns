package br.edu.ifpr.patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class EnumerationIterator implements Iterator {
   private Enumeration enumeration;

   public EnumerationIterator(Enumeration enumeration) {
      this.enumeration = enumeration;
   } // public EnumerationIterator(Enumeration

   public boolean hasNext() { return enumeration.hasMoreElements(); }

   public Object next() { return enumeration.nextElement(); }

   public void remove() {
      throw new UnsupportedOperationException("Operacao nao implementada.");
   } // public void remove()
} // public class EnumerationIterator implements Iterator
