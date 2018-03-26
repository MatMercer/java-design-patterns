package br.edu.ifpr.patterns.flyweight.impl;

import br.edu.ifpr.patterns.flyweight.AbstractCharacter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CharacterZ extends AbstractCharacter {
   public CharacterZ() {
      symbol  = 'Z';
      width   = 100;
      height  = 100;
      ascent  = 68;
      descent = 0;
   } // public CharacterA()

   @Override
   public void display(int pointSize) {
      this.pointSize = pointSize;
      System.out.println(symbol + " (pointSize " + pointSize + ")");
   } // public void display(int)
} // public class CharacterZ extends AbstractCharacter
