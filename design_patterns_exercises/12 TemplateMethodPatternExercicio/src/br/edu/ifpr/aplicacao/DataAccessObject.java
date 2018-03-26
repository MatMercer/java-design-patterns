package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class DataAccessObject {
   public static final String ENTIDADE_PRODUTO    = "produto";
   public static final String ENTIDADE_LANCAMENTO = "lancamento";

   public void connect() { System.out.println("Conectando."); }
   public void disconnect() { System.out.println("Desconectando."); }

   public void select(String entidade) {
      if (ENTIDADE_PRODUTO.equals(entidade)) {
         System.out.println("Obtendo Produtos.");
      } // if (ENTIDADE_PRODUTO.equals(entidade))
      else
         if (ENTIDADE_LANCAMENTO.equals(entidade)) {
         System.out.println("Obtendo Lancamentos.");
         } // if (ENTIDADE_LANCAMENTO.equals(entidade))
   } // public void select(String)

   public void process(String entidade) {
      if (ENTIDADE_PRODUTO.equals(entidade)) {
         System.out.println("Processando Produtos.");
      } // if (ENTIDADE_PRODUTO.equals(entidade))
      else
         if (ENTIDADE_LANCAMENTO.equals(entidade)) {
         System.out.println("Processando Lancamentos.");
         } // if (ENTIDADE_LANCAMENTO.equals(entidade))
   } // public void process(String)
} // public class DataAccessObject
