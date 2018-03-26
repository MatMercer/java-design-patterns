package br.edu.ifpr.patterns.factory;

import br.edu.ifpr.patterns.flyweight.AbstractCharacter;
import br.edu.ifpr.patterns.flyweight.impl.CharacterA;
import br.edu.ifpr.patterns.flyweight.impl.CharacterB;
import br.edu.ifpr.patterns.flyweight.impl.CharacterZ;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** Factory */
public class CharacterFactory {
   private Map<Character, AbstractCharacter> characters =
                                    new HashMap<Character, AbstractCharacter>();

   public AbstractCharacter getCharacter(char key) {
      AbstractCharacter character = characters.get(key);

      if (character == null) {
         switch (key) {
            case 'A' : character = new CharacterA(); break;
            case 'B' : character = new CharacterB(); break;
            case 'Z' : character = new CharacterZ(); break;
         } // switch (key)
         characters.put(key,character);
      } // if (character == null)

      return character;
   } // public AbstractCharacter getCharacter(char)
} // public class CharacterFactory
