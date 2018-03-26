package br.edu.ifpr.patterns.builder.impl;

import br.edu.ifpr.modelo.Veiculo;
import br.edu.ifpr.patterns.builder.VeiculoBuilder;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Motocicleta extends VeiculoBuilder {
   @Override
   public void buildCarroceria() {
      veiculo = new Veiculo("Motocicleta");
      veiculo.addParte("carroceria","Carroceria de Motocicleta");
   }

   @Override
   public void buildMotor() { veiculo.addParte("motor","150 HP"); }

   @Override
   public void buildRodas() { veiculo.addParte("rodas","2"); }

   @Override
   public void buildPortas() { veiculo.addParte("portas","0"); }
} // public class Motocicleta extends VeiculoBuilder
