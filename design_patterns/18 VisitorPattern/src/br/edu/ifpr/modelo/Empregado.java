package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.visitor.Elemento;
import br.edu.ifpr.patterns.visitor.Visitor;

/**
 * ElementoConcreto.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class Empregado extends Elemento {
   private String nome;
   private double salario;
   private int    ferias;

   public Empregado(String nome, double salario, int ferias) {
      setNome(nome);
      setSalario(salario);
      setFerias(ferias);
   } // public Empregado(String, double, int)
   
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setSalario(double salario) { this.salario = salario; }
   public void setFerias(int ferias) { this.ferias = ferias; }
   
   // getters
   public String getNome() { return nome; }
   public double getSalario() { return salario; }
   public int    getFerias() { return ferias; }

   @Override
   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
} // public class Empregado extends Elemento
