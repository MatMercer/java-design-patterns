package br.edu.ifpr.docs;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class XmlDocument extends Document {
   @Override
   public void open(String docName) {
      super.open(docName);
      System.out.println("Abrindo documento XML: " + docName);
   } // public void open(String)

   public void read() {
      System.out.println("Lendo documento XML: " + docName);
   }

   public void write() {
      System.out.println("Gravando documento XML: " + docName);
   }

   public void close() {
      System.out.println("Fechando documento XML: " + docName);
   }
} // public class XmlDocument extends Document
