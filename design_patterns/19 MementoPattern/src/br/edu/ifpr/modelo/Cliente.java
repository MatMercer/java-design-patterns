package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.memento.Memento;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Cliente {
   private String nome;
   private String cidade;

   public Cliente(String nome, String cidade) {
      setNome(nome);
      setCidade(cidade);
   } // public Cliente(String, String)
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setCidade(String cidade) { this.cidade = cidade; }
   // getters
   public String getNome() { return nome; }
   public String getCidade() { return cidade; }

   public Memento save() { return new Memento(nome,cidade); }

   public void restore(Memento memento) {
      setNome(memento.getNome());
      setCidade(memento.getCidade());
   } // public void restore(Memento)

   @Override
   public String toString() {
      return getClass().getSimpleName() + " [" + nome + ", " + cidade + "]";
   } // public String toString()
} // public class Cliente
