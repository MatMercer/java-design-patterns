package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.factory.CharacterFactory;
import br.edu.ifpr.patterns.flyweight.AbstractCharacter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FlyweightPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
      String document = "AAZZBBZB";
      char[] chars    = document.toCharArray();

      CharacterFactory cf = new CharacterFactory();

      // estado extr�nseco
      int pointSize = 10;

      // para cada caractere usa o objeto flyweight
      for (char c : chars) {
        pointSize++;
        AbstractCharacter character = cf.getCharacter(c);
        character.display(pointSize);
      } // for (char c : chars)
    } // public static void main(String[])
} // public class FlyweightPrincipal
