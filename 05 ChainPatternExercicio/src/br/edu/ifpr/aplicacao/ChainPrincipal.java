/*
 * Exercício: Chain of Responsibility.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Produto;
import br.edu.ifpr.patterns.chain.BalancaCozinha;
import br.edu.ifpr.patterns.chain.BalancaFarmacia;
import br.edu.ifpr.patterns.chain.BalancaPrecisao;

/**
 *
 * @author 
 */
public class ChainPrincipal {
   public ChainPrincipal() {
      int condicao = 1;

      switch (condicao) {
         case 1 : System.out.println("Processamento UM");     break;
         case 2 : System.out.println("Processamento DOIS");   break;
         case 3 : System.out.println("Processamento TRES");   break;
         case 4 : System.out.println("Processamento QUATRO"); break;
      } // switch (condicao)
   } // public ChainPrincipal()

   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) {
      BalancaPrecisao bp = new BalancaPrecisao();
      BalancaCozinha bc = new BalancaCozinha();
      BalancaFarmacia bf = new BalancaFarmacia();

      bp.setProximaBalanca(bc);
      bc.setProximaBalanca(bf);

      Produto cocaina = new Produto(0.01d);
      Produto farinha = new Produto(7.5d);
      Produto suaMae = new Produto(Double.MAX_VALUE);

      bp.medirPeso(cocaina);
      bp.medirPeso(farinha);
      bp.medirPeso(suaMae);
   }
} // public class ChainPrincipal
