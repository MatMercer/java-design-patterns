package br.edu.ifpr.modelo;

/**
*
* @author 
*/
public class Professor extends Pessoa {
   private String titulo;

   public Professor(int id, String nome, String titulo) {
      super(id,nome);
      this.titulo = titulo;
   } // public Professors(int, String, String)
   // setters
   public void setTitulo(String titulo) { this.titulo = titulo; }
   // getters
   public String getTitulo() { return titulo; }

   @Override
   public String toString() {
      return super.toString() + ", " + titulo;
   } // public String toString()
} // public class Professor extends Pessoa
