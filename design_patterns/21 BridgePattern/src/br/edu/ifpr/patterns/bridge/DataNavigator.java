package br.edu.ifpr.patterns.bridge;

import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** Implementor **/
public abstract class DataNavigator<T> {
   public abstract void    insert(T t);
   public abstract void    update(T t);
   public abstract void    delete(T t);
   public abstract List<T> select();
} // public abstract class DataNavigator
