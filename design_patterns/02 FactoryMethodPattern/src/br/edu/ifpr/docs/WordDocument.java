package br.edu.ifpr.docs;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class WordDocument extends Document {
   @Override
   public void open(String docName) {
      super.open(docName);
      System.out.println("Abrindo documento do Word: " + docName);
   } // public void open(String)

   public void read() {
      System.out.println("Lendo documento do Word: " + docName);
   }

   public void write() {
      System.out.println("Gravando documento do Word: " + docName);
   }

   public void close() {
      System.out.println("Fechando documento do Word: " + docName);
   }
} // public class WordDocument extends Document
