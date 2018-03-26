package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.modelo.Gnu;
import br.edu.ifpr.modelo.Leao;
import br.edu.ifpr.patterns.factory.CarnivoroFactory;
import br.edu.ifpr.patterns.factory.HerbivoroFactory;

/**
 * De acordo com o Diagrama de Classes para o padrão de projetos
 * AbstractFactory, esta classe representa ConcreteFactory1.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class AfricaAbstractFactory implements ContinenteAbstractFactory {
   public HerbivoroFactory createHerbivoroFactory() { return new Gnu(); }
   public CarnivoroFactory createCarnivoroFactory() { return new Leao(); }
} // public class AfricaAbstractFactory implements ContinenteAbstractFactory
