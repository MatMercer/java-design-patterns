/*
 * Exercício: Façade.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.facade.Almoxarifado;
import br.edu.ifpr.patterns.facade.Cliente;
import br.edu.ifpr.patterns.facade.Gerente;
import br.edu.ifpr.patterns.facade.Venda;

/**
 * @author
 */
public class FacadePrincipal {
    private Cliente cliente;
    private Gerente gerente;
    private Almoxarifado almoxarifado;

    public FacadePrincipal() {
        cliente = new Cliente();
        gerente = new Gerente();
        almoxarifado = new Almoxarifado();
    }

    public void tentarVenda(Venda venda) {
        if (gerente.validarVenda(venda)) {
            almoxarifado.despacharProduto();
            cliente.enviarEmail();
        }
    }

    //    public FacadePrincipal() {
        // fechar venda
        // se valor da venda eh maior que um determinado valor
        //    entao pedir confirmacao do gerente de vendas
        // fim-se
        // requisitar ao almoxarifado que despeche os produtos
        // enviar e-mail ao cliente agradecendo a compra


//    } // public FacadePrincipal()

    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        FacadePrincipal facadePrincipal = new FacadePrincipal();

        facadePrincipal.tentarVenda(new Venda(745));
        facadePrincipal.tentarVenda(new Venda(1341));
    }
} // public class FacadePrincipal
