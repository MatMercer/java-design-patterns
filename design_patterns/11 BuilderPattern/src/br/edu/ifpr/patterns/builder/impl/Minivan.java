package br.edu.ifpr.patterns.builder.impl;

import br.edu.ifpr.modelo.Veiculo;
import br.edu.ifpr.patterns.builder.VeiculoBuilder;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Minivan extends VeiculoBuilder {
   @Override
   public void buildCarroceria() {
      veiculo = new Veiculo("Minivan");
      veiculo.addParte("carroceria","Carroceria de Sprint");
   }

   @Override
   public void buildMotor() { veiculo.addParte("motor","4800 HP"); }

   @Override
   public void buildRodas() { veiculo.addParte("rodas","6"); }

   @Override
   public void buildPortas() { veiculo.addParte("portas","3"); }
} // public class Minivan extends VeiculoBuilder
