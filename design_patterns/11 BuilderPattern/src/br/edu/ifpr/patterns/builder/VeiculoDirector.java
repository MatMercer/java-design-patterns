package br.edu.ifpr.patterns.builder;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VeiculoDirector {
   public void buildVeiculo(VeiculoBuilder vb) {
      vb.buildCarroceria();
      vb.buildMotor();
      vb.buildPortas();
      vb.buildRodas();
   } // public void buildVeiculo(VeiculoBuilder)
} // public class VeiculoDirector
