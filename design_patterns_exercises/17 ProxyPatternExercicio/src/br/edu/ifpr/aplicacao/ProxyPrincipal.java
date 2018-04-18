/*
 * Exercício: Proxy.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.proxy.DadosBancarios;
import br.edu.ifpr.patterns.proxy.DadosBancariosProxy;

/**
 * @author
 */
public class ProxyPrincipal {
    public static void main(String[] args) {
        DadosBancarios dadosBancarios = new DadosBancariosProxy();

        try {
            System.out.println(dadosBancarios.acessarSaldo(2));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println(dadosBancarios.acessarSaldo(3));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
} // public class ProxyPrincipal
