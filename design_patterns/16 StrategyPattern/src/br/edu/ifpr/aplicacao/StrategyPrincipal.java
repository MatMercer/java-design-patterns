package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.strategy.DatabaseStrategy;
import br.edu.ifpr.patterns.strategy.impl.MSAccessStrategy;
import br.edu.ifpr.patterns.strategy.impl.SQLServerStrategy;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class StrategyPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       DatabaseStrategy ds       = null;
       int              database = 2;

       if (database == 1)
          ds = new MSAccessStrategy("servidor","base","usuario","senha");
       else
          if (database == 2)
             ds = new SQLServerStrategy("servidor","base","usuario","senha");
       
       if (ds != null)
          System.out.println("URL " + ds.generateURL());
    } // public static void main(String[])
} // public class StrategyPrincipal
