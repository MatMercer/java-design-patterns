/*
 * Exercício: Template Method.
 * Converter esta aplicação para que faça uso do padrão de projetos Template
 * Method, realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class TemplatePrincipal {
   public TemplatePrincipal() {
      DataAccessObject dao = new DataAccessObject();

      dao.connect();
      dao.select(DataAccessObject.ENTIDADE_PRODUTO);
      dao.process(DataAccessObject.ENTIDADE_PRODUTO);

      dao.select(DataAccessObject.ENTIDADE_LANCAMENTO);
      dao.process(DataAccessObject.ENTIDADE_LANCAMENTO);

      dao.disconnect();
   } // public TemplatePrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new TemplatePrincipal(); }
} // public class TemplatePrincipal
