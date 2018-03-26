package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Google;
import br.edu.ifpr.modelo.IBM;
import br.edu.ifpr.patterns.observer.impl.InvestidorImpl;

import java.math.BigDecimal;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ObserverPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       // observadores
       InvestidorImpl i1 = new InvestidorImpl("Thor");
       InvestidorImpl i2 = new InvestidorImpl("Zeus");
       InvestidorImpl i3 = new InvestidorImpl("Atena");
       InvestidorImpl i4 = new InvestidorImpl("Apolo");
       InvestidorImpl i5 = new InvestidorImpl("Eros");
       // observável
       IBM ibm = new IBM("IBM",new BigDecimal(13.5));
       ibm.attach(i1);
       ibm.attach(i2);
       ibm.setPreco(new BigDecimal(15));
       ibm.setPreco(new BigDecimal(16.3));
       ibm.setPreco(new BigDecimal(17));
       // observável
       Google google = new Google("GOG",new BigDecimal(56.0));
       google.attach(i3);
       google.attach(i4);
       google.attach(i5);
       google.setPreco(new BigDecimal(60));
       google.setPreco(new BigDecimal(58.5));
       google.setPreco(new BigDecimal(59));
    } // public static void main(String[])
} // public class ObserverPrincipal
