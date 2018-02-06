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
   private double salarioLiquido;

   public Funcionario(String nome, double salario) {
      setNome(nome);
      setSalario(salario);
   } // public Funcionario(String, double)
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setSalario(double salario) { this.salario = salario; }
   public void setProventos(double proventos) { this.proventos = proventos; }
   public void setDespesas(double despesas) { this.despesas = despesas; }
   // getters
   public String getNome() { return nome; }
   public double getSalario() { return salario; }
   public double getProventos() { return proventos; }
   public double getDespesas() { return despesas; }

   public double calcularSalarioLiquido() {
      salarioLiquido = salario + proventos - despesas;
      
      return salarioLiquido;
   } // public double calcularSalarioLiquido()
} // public class Funcionario
