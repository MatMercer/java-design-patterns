/*
 * Classe principal para a aplicação de teste do padrão de projetos Factory
 * Method.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.docs.Document;
import br.edu.ifpr.patterns.factory.DocumentFactory;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FactoryPrincipal {
    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
       Document doc = DocumentFactory.createDynamicDocumentFactory(
                                                     DocumentFactory.XML_DOC);

       doc.open("nome_do_arquivo");
       doc.close();
    } // public static void main(String[])
} // public class FactoryPrincipal
