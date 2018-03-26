package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.facade.DataFacade;

import java.text.ParseException;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FacadePrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) throws ParseException {
       DataFacade df = new DataFacade("10/05/2008");
       
       System.out.println("ANTES DE SOMAR " + df);
       df.add(365);
       System.out.println("DEPOIS DE SOMAR " + df);
       System.out.println("ANTES DE SUBTRAIR " + df);
       df.subtract(30);
       System.out.println("DEPOIS DE SUBTRAIR " + df);
    } // public static void main(String[]) throws ParseException
} // public class FacadePrincipal
