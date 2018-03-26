package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.builder.VeiculoDirector;
import br.edu.ifpr.patterns.builder.impl.Carro;
import br.edu.ifpr.patterns.builder.impl.Minivan;
import br.edu.ifpr.patterns.builder.impl.Motocicleta;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class BuilderPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       VeiculoDirector vd          = new VeiculoDirector();
       Minivan         minivan     = new Minivan();
       Carro           carro       = new Carro();
       Motocicleta     motocicleta = new Motocicleta();
       
       vd.buildVeiculo(minivan);
       minivan.getVeiculo().mostrar();

       vd.buildVeiculo(carro);
       carro.getVeiculo().mostrar();

       vd.buildVeiculo(motocicleta);
       motocicleta.getVeiculo().mostrar();
    } // public static void main(String[])
} // public class BuilderPrincipal
