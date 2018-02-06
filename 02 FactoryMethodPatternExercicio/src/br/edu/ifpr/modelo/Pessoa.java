package br.edu.ifpr.modelo;

/**
 *
 * @author 
 */
public abstract class Pessoa {
   private int    id;
   private String nome;

   public Pessoa() {}
   public Pessoa(int id, String nome) {
      setId(id);
      setNome(nome);
   } // public Pessoa(int, String)
   public Pessoa(Pessoa pessoa) {
      setId(pessoa.id);
      setNome(pessoa.nome);
   } // public Pessoas(Pessoas)
   // setters
   public void setId(int id) { this.id = id; }
   public void setNome(String nome) { this.nome = nome; }
   // getters
   public int    getId() { return id; }
   public String getNome() { return nome; }

   @Override
   public String toString() { return id + ", " + nome; }
} // public abstract class Pessoas
