/*
 * Exercício: Flyweight.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.gui.DesenharLinhas;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FlyweightPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       DesenharLinhas dl = new DesenharLinhas();
       dl.setLocationRelativeTo(null);
       dl.setVisible(true);
    } // public static void main(String[])
} // public class FlyweightPrincipal
