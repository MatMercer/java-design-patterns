package br.edu.ifpr.patterns.flyweight.impl;

import br.edu.ifpr.patterns.flyweight.AbstractCharacter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CharacterB extends AbstractCharacter {
   public CharacterB() {
      symbol  = 'B';
      width   = 140;
      height  = 100;
      ascent  = 72;
      descent = 0;
   } // public CharacterA()

   @Override
   public void display(int pointSize) {
      this.pointSize = pointSize;
      System.out.println(symbol + " (pointSize " + pointSize + ")");
   } // public void display(int)
} // public class CharacterB extends AbstractCharacter
