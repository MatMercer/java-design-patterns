package br.edu.ifpr.patterns.visitor;

/**
 * Elemento.
 * 
 * @author Romualdo Rubens de Freitas
 */
public abstract class Elemento {
   public abstract void accept(Visitor visitor);
} // public abstract class Elemento
