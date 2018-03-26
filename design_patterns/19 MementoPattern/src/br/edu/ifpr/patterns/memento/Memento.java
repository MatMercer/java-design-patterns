package br.edu.ifpr.patterns.memento;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Memento {
   private String nome;
   private String cidade;

   public Memento(String nome, String cidade) {
      this.nome   = nome;
      this.cidade = cidade;
   } // public Memento(String, String)
   // getters
   public String getNome() { return nome; }
   public String getCidade() { return cidade; }
} // public class Memento
