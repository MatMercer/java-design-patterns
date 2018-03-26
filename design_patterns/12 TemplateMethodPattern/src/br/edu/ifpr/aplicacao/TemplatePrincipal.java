package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.VendaRS;
import br.edu.ifpr.patterns.template.Venda;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class TemplatePrincipal {
    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
       Venda v = new VendaRS();
       v.finalizarVenda();
       System.out.println("Venda no Parana: " + v.getIcms());
    } // public static void main(String[])
} // public class TemplatePrincipal
