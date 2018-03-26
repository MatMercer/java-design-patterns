package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Livro;
import br.edu.ifpr.modelo.Periodico;
import br.edu.ifpr.patterns.decorator.impl.Emprestimo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DecoratorPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Livro livro = new Livro("Java Como Programar","DEITEL & DEITEL",5);
       livro.mostrar();

       Emprestimo emprestimo = new Emprestimo(livro);
       emprestimo.emprestar("Ada Lovelace");
       emprestimo.mostrar();
       emprestimo.emprestar("Marques de Sade");
       emprestimo.mostrar();
       emprestimo.emprestar("Marques de Sade");
       emprestimo.mostrar();
       emprestimo.devolver("Marques de Sade");
       emprestimo.mostrar();

       Periodico periodico = new Periodico("Java Magazine","DevMedia",4,55,3);
       periodico.mostrar();
    } // public static void main(String[])
} // public class DecoratorPrincipal
