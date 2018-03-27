/*
 * Exercício: Template Method.
 * Converter esta aplicação para que faça uso do padrão de projetos Template
 * Method, realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Lancamento;
import br.edu.ifpr.modelo.Produto;
import br.edu.ifpr.patterns.template.VendaFactory;
import br.edu.ifpr.patterns.template.VendaType;

/**
 * @author
 */
public class TemplatePrincipal {
    public TemplatePrincipal() {
        final double PRECO = 35;

        Lancamento lancamento = new Lancamento(
                VendaFactory.getVenda(VendaType.PR, new Produto(PRECO))
        );

        lancamento.lancar();

        lancamento.setVenda(VendaFactory.getVenda(VendaType.AM, new Produto(PRECO)));

        lancamento.lancar();
    } // public TemplatePrincipal()

    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
        new TemplatePrincipal();
    }
} // public class TemplatePrincipal
