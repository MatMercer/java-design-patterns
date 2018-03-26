package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.abstractfactory.ContinenteAbstractFactory;
import br.edu.ifpr.patterns.factory.CarnivoroFactory;
import br.edu.ifpr.patterns.factory.HerbivoroFactory;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class MundoAnimal {
   private CarnivoroFactory carnivoro;
   private HerbivoroFactory herbivoro;

   public MundoAnimal(ContinenteAbstractFactory abstractFactory) {
      carnivoro = abstractFactory.createCarnivoroFactory();
      herbivoro = abstractFactory.createHerbivoroFactory();
   } // public MundoAnimal(ContinenteAbstractFactory

   public void cadeiaAlimentar() { carnivoro.alimentar(herbivoro); }
} // public class MundoAnimal
