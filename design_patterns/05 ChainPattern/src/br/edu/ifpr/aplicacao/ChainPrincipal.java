package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Compra;
import br.edu.ifpr.patterns.chain.impl.Diretor;
import br.edu.ifpr.patterns.chain.impl.GerenteVendas;
import br.edu.ifpr.patterns.chain.impl.Vendedor;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ChainPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Vendedor      v  = new Vendedor();
       GerenteVendas gv = new GerenteVendas();
       Diretor       d  = new Diretor();
       
       v.setProximo(gv);
       gv.setProximo(d);
       
       Compra c = new Compra(1,7500);
       v.processarRequisicao(c);
       
       c = new Compra(2,11500);
       v.processarRequisicao(c);
       
       c = new Compra(3,62130.5);
       v.processarRequisicao(c);
    } // public static void main(String[])
} // public class ChainPrincipal
