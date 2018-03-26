package br.edu.ifpr.docs;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ExcelDocument extends Document {
   @Override
   public void open(String docName) {
      super.open(docName);
      System.out.println("Abrindo documento do Excel: " + docName);
   } // public void open(String)

   public void read() {
      System.out.println("Lendo documento do Excel: " + docName);
   }

   public void write() {
      System.out.println("Gravando documento do Excel: " + docName);
   }

   public void close() {
      System.out.println("Fechando documento do Excel: " + docName);
   }
} // public class ExcelDocument extends Document
