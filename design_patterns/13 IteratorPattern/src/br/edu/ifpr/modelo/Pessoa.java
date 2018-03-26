package br.edu.ifpr.modelo;

import java.util.Date;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Pessoa {
   private int    id;
   private String nome;
   private Date   nascimento;

   public Pessoa(int id, String nome, Date nascimento) {
      setId(id);
      setNome(nome);
      setNascimento(nascimento);
   } // public Pessoa(int, String, Date)
   // setters
   public void setId(int id) { this.id = id; }
   public void setNome(String nome) { this.nome = nome; }
   public void setNascimento(Date nascimento) { this.nascimento = nascimento; }
   // getters
   public int    getId() { return id; }
   public String getNome() { return nome; }
   public Date   getNascimento() { return nascimento; }
   
   @Override
   public String toString() {
      return "Pessoa [" + id + ", " + nome + ", " + calcularIdade() + " anos]";
   } // public String toString()

   public int calcularIdade() {
      return (int) (((new Date()).getTime() - nascimento.getTime()) /
                    (24L * 60L * 60L * 1000L) / 365L);
   } // public int calcularIdade()
} // public class Pessoa
