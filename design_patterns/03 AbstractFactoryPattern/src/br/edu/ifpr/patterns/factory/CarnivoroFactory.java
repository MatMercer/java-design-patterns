package br.edu.ifpr.patterns.factory;

/**
 * De acordo com o Diagrama de Classes para o padrão de projetos
 * AbstractFactory, esta classe representa AbstractProductB.
 *
 * @author Romualdo Rubens de Freitas
 */
public interface CarnivoroFactory {
    void alimentar(HerbivoroFactory h);
} // public interface CarnivoroFactory
