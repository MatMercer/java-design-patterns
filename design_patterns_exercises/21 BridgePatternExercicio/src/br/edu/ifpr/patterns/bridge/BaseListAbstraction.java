package br.edu.ifpr.patterns.bridge;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class BaseListAbstraction {
   private ListImplementor imp;

   public void setImplementor(ListImplementor imp) {}

   public void add(String item) {}

   public void add(String item, int position) {
   } // public void add(String, int)

   public void remove(String item) {}

   public String get(int index) { return null; }

   public int count() { return -1; }
} // public class BaseListAbstraction
