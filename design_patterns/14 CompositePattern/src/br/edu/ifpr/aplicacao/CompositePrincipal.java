package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.DepartamentoComposite;
import br.edu.ifpr.modelo.FuncionarioLeaf;

import java.math.BigDecimal;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CompositePrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       FuncionarioLeaf f1 = new FuncionarioLeaf("Mozart",new BigDecimal(1234.6));
       FuncionarioLeaf f2 = new FuncionarioLeaf("Van Gogh",new BigDecimal(34));
       FuncionarioLeaf f3 = new FuncionarioLeaf("Michelangelo",new BigDecimal(415));
       FuncionarioLeaf f4 = new FuncionarioLeaf("Da Vinci",new BigDecimal(779.1));
       FuncionarioLeaf f5 = new FuncionarioLeaf("Bach",new BigDecimal(333.2));

       DepartamentoComposite d1 = new DepartamentoComposite("Artes & Musica");

       d1.add(f2);
       d1.add(f3);
       d1.add(f4);

       f1.processar();
       d1.processar();
       f5.processar();
    } // public static void main(String)
} // public class CompositePrincipal
