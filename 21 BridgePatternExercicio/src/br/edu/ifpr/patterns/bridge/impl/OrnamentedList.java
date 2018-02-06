package br.edu.ifpr.patterns.bridge.impl;

import br.edu.ifpr.patterns.bridge.BaseListAbstraction;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class OrnamentedList extends BaseListAbstraction {
   private char type;

   public void setType(char type) {}
   public char getType() { return 0x00; }

   @Override
   // concatenar o tipo com um espaço e com o texto.
   public String get(int index) { return null; }
} // public class OrnamentedList extends BaseListAbstraction
