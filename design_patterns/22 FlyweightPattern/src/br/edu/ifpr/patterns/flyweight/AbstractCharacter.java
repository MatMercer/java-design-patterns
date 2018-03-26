package br.edu.ifpr.patterns.flyweight;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** Flyweight */
public abstract class AbstractCharacter {
   protected char symbol;
   protected int  width;
   protected int  height;
   protected int  ascent;
   protected int  descent;
   protected int  pointSize;

   public abstract void display(int pointSize);
} // public abstract class AbstractCharacter
