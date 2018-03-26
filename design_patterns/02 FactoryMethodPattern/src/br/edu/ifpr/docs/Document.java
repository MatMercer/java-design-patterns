package br.edu.ifpr.docs;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Document {
   protected String docName;

   public void open(String docName) { this.docName = docName; }
   public abstract void read();
   public abstract void write();
   public abstract void close();
} // public abstract class Document
