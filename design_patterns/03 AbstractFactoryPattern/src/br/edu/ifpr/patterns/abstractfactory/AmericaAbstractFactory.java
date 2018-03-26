package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.modelo.Bufalo;
import br.edu.ifpr.modelo.Lobo;
import br.edu.ifpr.patterns.factory.CarnivoroFactory;
import br.edu.ifpr.patterns.factory.HerbivoroFactory;

/**
 * De acordo com o Diagrama de Classes para o padrão de projetos
 * AbstractFactory, esta classe representa ConcreteFactory2.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class AmericaAbstractFactory implements ContinenteAbstractFactory {
   public HerbivoroFactory createHerbivoroFactory() { return new Bufalo(); }
   public CarnivoroFactory createCarnivoroFactory() { return new Lobo(); }
} // public class AmericaAbstractFactory implements ContinenteAbstractFactory
