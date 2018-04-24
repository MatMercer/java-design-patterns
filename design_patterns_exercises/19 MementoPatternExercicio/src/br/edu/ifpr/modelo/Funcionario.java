package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Funcionario {
   private String nome;
   private double salario;
   private double proventos;
   private double despesas;

   public Funcionario(String nome, double salario) {
      setNome(nome);
      setSalario(salario);
   } // public Funcionario(String, double)
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setSalario(double salario) { this.salario = salario; }
   public void setProventos(double proventos) { this.proventos = proventos; }
   public void setDespesas(double despesas) { this.despesas = despesas; }

   public void save() {
      Memento.salario = this.salario;
   }

   public void restore() {
       this.salario = Memento.salario;
   }

   // getters
   public String getNome() { return nome; }
   public double getSalario() { return salario; }
   public double getProventos() { return proventos; }
   public double getDespesas() { return despesas; }

   public void calcularSalarioLiquido() {
      salario =  salario + proventos - despesas;
   } // public double calcularSalarioLiquido()

   public static class Memento {
      private static double salario;

      public Memento(double salari) {
         salario = salari;
      }

      private double getSavedSalario() {
         return salario;
      }
   }
} // public class Funcionario
