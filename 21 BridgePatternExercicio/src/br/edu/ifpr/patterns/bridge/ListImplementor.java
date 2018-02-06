package br.edu.ifpr.patterns.bridge;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public interface ListImplementor {
   public void    addItem(String item);
   public void    addItem(String item, int position);
   public void    removeItem(String item);
   public int     getNumberOfItems();
   public String  getItem(int index);
   public boolean supportsOrdering();
} // public interface ListImplementor
