package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Fretias
 */
public class Cliente {
   private int    id;
   private String nome;
   private String cpf;

   public Cliente(int id, String nome, String cpf) {
      setId(id);
      setNome(nome);
      setCpf(cpf);
   } // public Cliente(String, String)
   // setters
   public void setId(int id) { this.id = id; }
   public void setNome(String nome) { this.nome = nome; }
   public void setCpf(String cpf) { this.cpf = cpf; }
   // getters
   public int    getId() { return id; }
   public String getNome() { return nome; }
   public String getCpf() { return cpf; }

   @Override
   public String toString() {
      return "Cliente [" + id + ", " + nome + ", " + cpf + "]";
   } // public String toString()

   @Override
   public boolean equals(Object obj) {
      if (obj == null) return false;
      if (obj == this) return true;
      if (obj.getClass() != getClass()) return false;

      final Cliente c = (Cliente) obj;
      if (this.id == c.id && this.nome.equals(c.nome) && this.cpf.equals(c.cpf))
         return true;

      return false;
   } // public boolean equals(Object)

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 17 * hash + this.id;
      hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
      hash = 17 * hash + (this.cpf != null ? this.cpf.hashCode() : 0);

      return hash;
   } // public int hashCode()
} // public class Cliente
