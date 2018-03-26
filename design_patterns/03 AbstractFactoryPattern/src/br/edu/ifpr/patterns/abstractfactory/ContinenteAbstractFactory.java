package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.patterns.factory.CarnivoroFactory;
import br.edu.ifpr.patterns.factory.HerbivoroFactory;

/**
 * De acordo com o Diagrama de Classes para este padrão, este interface
 * representa AbstractFactory.
 * 
 * @author Romualdo Rubens de Freitas
 */
public interface ContinenteAbstractFactory {
   HerbivoroFactory createHerbivoroFactory();
   CarnivoroFactory createCarnivoroFactory();
} // public interface ContinenteAbstractFactory
