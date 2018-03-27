/*
 * Exercício: Iterator.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Pessoa;
import br.edu.ifpr.patterns.iterator.Iterator;

/**
 * @author
 */
public class IteratorPrincipal {
    private Pessoa[] pessoas = new Pessoa[5];

    public void popularPessoas() {
        pessoas[0] = new Pessoa(1, "Pedro Alvares Cabral");
        pessoas[1] = new Pessoa(2, "Pero Vaz de Caminha");
        pessoas[2] = new Pessoa(3, "Vasco da Gama");
        pessoas[3] = new Pessoa(4, "Cristovão Colombo");
        pessoas[4] = new Pessoa(5, "Bartolomeu de Gusmão");
    }

    public IteratorPrincipal() {
        popularPessoas();
        Iterator<Pessoa> pessoaIterator = new Iterator<>(pessoas);

        while (!pessoaIterator.isDone()) {
            System.out.println(pessoaIterator.next());
        }
    } // public IteratorPrincipal()

    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        new IteratorPrincipal();
    }
} // public class IteratorPrincipal
