package br.edu.ifpr.patterns.composite;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Component {
   public abstract void      add(Component component);
   public abstract boolean   remove(Component component);
   public abstract Component getChild(int index);

   public abstract void      processar();
} // public abstract class Component
