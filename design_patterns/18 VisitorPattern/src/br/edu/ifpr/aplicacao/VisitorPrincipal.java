package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Balconista;
import br.edu.ifpr.modelo.Diretor;
import br.edu.ifpr.modelo.Presidente;
import br.edu.ifpr.modelo.Secretaria;
import br.edu.ifpr.modelo.util.Empregados;
import br.edu.ifpr.patterns.visitor.impl.AssalariadoVisitor;
import br.edu.ifpr.patterns.visitor.impl.FeriasVisitor;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class VisitorPrincipal {
    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
       Empregados empregados = new Empregados();
       
       empregados.addEmpregado(new Balconista());
       empregados.addEmpregado(new Secretaria());
       empregados.addEmpregado(new Diretor());
       empregados.addEmpregado(new Presidente());
       
       empregados.accept(new AssalariadoVisitor());
       empregados.accept(new FeriasVisitor());
    } // public static void main(String[])
} // public class VisitorPrincipal
