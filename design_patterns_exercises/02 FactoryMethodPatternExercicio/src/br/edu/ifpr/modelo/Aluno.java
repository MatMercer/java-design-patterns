package br.edu.ifpr.modelo;

/**
*
* @author 
*/
public class Aluno extends Pessoa {
   private int anoIngresso;

   public Aluno(int id, String nome, int anoIngresso) {
      super(id,nome);
      this.anoIngresso = anoIngresso;
   } // public Professors(int, String, int)
   // setters
   public void setAnoIngresso(int anoIngresso) {this.anoIngresso = anoIngresso;}
   // getters
   public int getAnoIngresso() { return anoIngresso; }

   @Override
   public String toString() {
      return super.toString() + ", " + anoIngresso;
   } // public String toString()
} // public class Aluno extends Pessoa
