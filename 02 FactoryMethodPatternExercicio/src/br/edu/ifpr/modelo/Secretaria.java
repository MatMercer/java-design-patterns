package br.edu.ifpr.modelo;

/**
*
* @author 
*/
public class Secretaria extends Pessoa {
   private String depto;

   public Secretaria(int id, String nome, String depto) {
      super(id,nome);
      this.depto = depto;
   } // public Professors(int, String, String)
   // setters
   public void setDepto(String depto) { this.depto = depto; }
   // getters
   public String getDepto() { return depto; }

   @Override
   public String toString() {
      return super.toString() + ", " + depto;
   } // public String toString()
} // public class Secretarias extends Pessoas
