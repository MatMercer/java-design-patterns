package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.factory.CarnivoroFactory;
import br.edu.ifpr.patterns.factory.HerbivoroFactory;

/**
 * De acordo com o Diagrama de Classes para o padrão de projetos
 * AbstractFactory, esta classe representa ProductB1.
 *
 * @author Romualdo Rubens de Freitas
 */
public class Leao implements CarnivoroFactory {
   public void alimentar(HerbivoroFactory h) {
      System.out.println(this.getClass().getSimpleName() + " aliementa-se de " +
                         h.getClass().getSimpleName());
   } // public void alimentar(HerbivoroFactory)
} // public class Leao implements CarnivoroFactory
