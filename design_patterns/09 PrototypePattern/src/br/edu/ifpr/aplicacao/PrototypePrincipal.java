package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.factory.PrototypeFactory;
import br.edu.ifpr.patterns.prototype.Alguem;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class PrototypePrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       String[] pessoas = { "fulano", "beltrano", "fulano",
                            "cicrano", "beltrano", "cicrano"
                          };

       for (int i = 0; i < pessoas.length; i++) {
          Alguem a = PrototypeFactory.createPrototypeFactory(pessoas[i]);
          System.out.println("Alguem: " + a);
       } // for (int i = 0; i < pessoas.length; i++)
    } // public static void main(String[])
} // public class PrototypePrincipal
