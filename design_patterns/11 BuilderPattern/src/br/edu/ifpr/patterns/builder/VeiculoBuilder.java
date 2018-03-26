package br.edu.ifpr.patterns.builder;

import br.edu.ifpr.modelo.Veiculo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class VeiculoBuilder {
   protected Veiculo veiculo;

   public Veiculo getVeiculo() { return veiculo; }

   public abstract void buildCarroceria();
   public abstract void buildMotor();
   public abstract void buildRodas();
   public abstract void buildPortas();
} // public abstract class VeiculoBuilder
