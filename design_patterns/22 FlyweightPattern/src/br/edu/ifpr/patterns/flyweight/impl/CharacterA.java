package br.edu.ifpr.patterns.flyweight.impl;

import br.edu.ifpr.patterns.flyweight.AbstractCharacter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** ConcreteFlyweight */
public class CharacterA extends AbstractCharacter {
   public CharacterA() {
      symbol  = 'A';
      width   = 120;
      height  = 100;
      ascent  = 70;
      descent = 0;
   } // public CharacterA()

   @Override
   public void display(int pointSize) {
      this.pointSize = pointSize;
      System.out.println(symbol + " (pointSize " + pointSize + ")");
   } // public void display(int)
} // public class CharacterA extends AbstractCharacter
