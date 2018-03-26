package br.edu.ifpr.docs;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class TextDocument extends Document {
   @Override
   public void open(String docName) {
      super.open(docName);
      System.out.println("Abrindo documento Texto: " + docName);
   } // public void open(String)

   public void read() {
      System.out.println("Lendo documento Texto: " + docName);
   }

   public void write() {
      System.out.println("Gravando documento Texto: " + docName);
   }

   public void close() {
      System.out.println("Fechando documento Texto: " + docName);
   }
} // public class TextDocument extends Document
