package br.edu.ifpr.patterns.factory;

import br.edu.ifpr.patterns.prototype.Alguem;
import br.edu.ifpr.patterns.prototype.impl.Beltrano;
import br.edu.ifpr.patterns.prototype.impl.Cicrano;
import br.edu.ifpr.patterns.prototype.impl.Fulano;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class PrototypeFactory {
   private static Map<String, Alguem> pessoas = new HashMap<String, Alguem>();
   
   static {
      pessoas.put("fulano",new Fulano());
      pessoas.put("cicrano",new Cicrano());
      pessoas.put("beltrano",new Beltrano());
   }

   public static Alguem createPrototypeFactory(String quem) {
      return ((Alguem) pessoas.get(quem)).duplicate();
   } // public static Alguem createPrototypeFactory(String)
} // public class PrototypeFactory
