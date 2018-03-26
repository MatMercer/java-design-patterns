package br.edu.ifpr.patterns.builder.impl;

import br.edu.ifpr.modelo.Veiculo;
import br.edu.ifpr.patterns.builder.VeiculoBuilder;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Carro extends VeiculoBuilder {
   @Override
   public void buildCarroceria() {
      veiculo = new Veiculo("Carro");
      veiculo.addParte("carroceria","Carroceria de carro de passeio");
   }

   @Override
   public void buildMotor() { veiculo.addParte("motor","2000 HP"); }

   @Override
   public void buildRodas() { veiculo.addParte("rodas","4"); }

   @Override
   public void buildPortas() { veiculo.addParte("portas","2"); }
} // public class Carro extends VeiculoBuilder
