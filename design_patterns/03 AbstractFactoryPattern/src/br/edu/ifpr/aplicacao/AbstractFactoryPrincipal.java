package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.abstractfactory.AfricaAbstractFactory;
import br.edu.ifpr.patterns.abstractfactory.AmericaAbstractFactory;
import br.edu.ifpr.patterns.abstractfactory.ContinenteAbstractFactory;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class AbstractFactoryPrincipal {
   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) {
      ContinenteAbstractFactory africa = new AfricaAbstractFactory();
      MundoAnimal mundoAnimal = new MundoAnimal(africa);
      mundoAnimal.cadeiaAlimentar();

      ContinenteAbstractFactory america = new AmericaAbstractFactory();
      mundoAnimal = new MundoAnimal(america);
      mundoAnimal.cadeiaAlimentar();
   } // public static void main(String[])
} // public class AbstractFactoryPrincipal
