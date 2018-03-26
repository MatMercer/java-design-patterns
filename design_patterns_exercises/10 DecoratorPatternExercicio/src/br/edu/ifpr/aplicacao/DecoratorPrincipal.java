/*
 * Exercício: Decorator.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.decorator.Comparador;
import br.edu.ifpr.patterns.decorator.ComparadorB;
import br.edu.ifpr.patterns.decorator.ComparadorC;
import br.edu.ifpr.patterns.decorator.ComparadorSimples;

import static java.lang.System.out;

/**
 * @author
 */
public class DecoratorPrincipal {
    public DecoratorPrincipal() {
        out.println("Comportamento A sozinho");
        Comparador comparadorA = new ComparadorSimples();
        comparadorA.comparar();

        out.println("Comportamento A + B");
        Comparador comparadorB = new ComparadorB(comparadorA);
        comparadorB.comparar();

        out.println("Comportamento A + B + C");
        Comparador comparadorC = new ComparadorC(comparadorB);
        comparadorC.comparar();

        out.println("Comportamento A + C");
        comparadorC = new ComparadorC(comparadorA);
        comparadorC.comparar();
    } // public DecoratorPrincipal()

    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        new DecoratorPrincipal();
    }
} // public class DecoratorPrincipal
