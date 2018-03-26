package br.edu.ifpr.patterns.observer.impl;

import br.edu.ifpr.modelo.AcaoAbstract;
import br.edu.ifpr.patterns.observer.Investidor;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class InvestidorImpl implements Investidor {
   private String       nome;
   private AcaoAbstract acao;

   public InvestidorImpl(String nome) { setNome(nome); }
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setAcao(AcaoAbstract acao) { this.acao = acao; }
   // getters
   public String       getNome() { return nome; }
   public AcaoAbstract getAcao() { return acao; }

   @Override
   public void update(AcaoAbstract acao) {
      System.out.println("A acao " + acao.getSimbolo() + " do investidor " +
                         nome + " mudou seu valor para $" + acao.getPreco());
   } // public void update(AcaoAbstract)
} // public class InvestidorImpl implements Investidor
