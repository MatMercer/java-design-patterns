package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.composite.Component;

import java.math.BigDecimal;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FuncionarioLeaf extends Component {
   private String     nome;
   private BigDecimal salario;

   public FuncionarioLeaf(String nome, BigDecimal salario) {
      setNome(nome);
      setSalario(salario);
   } // public FuncionarioLeaf(String, BigDecimal)
   // setters
   public void setNome(String nome) { this.nome = nome; }
   public void setSalario(BigDecimal salario) { this.salario = salario; }
   // getters
   public String     getNome() { return nome; }
   public BigDecimal getSalario() { return salario; }

   @Override
   public void processar() { System.out.println(nome + " ganha " + salario); }

   // --------------------------------------------------------------------------
   // Fica a critério do desenvolvedor implementar os métodos que não interessam
   // ao elemento folha (leaf) da forma que melhor atenda aos requisitos do
   // projeto. Neste caso, uma exceção será lançada caso algum dos métodos a
   // seguir for invocado.
   // --------------------------------------------------------------------------
   @Override
   public void add(Component component) {
      throw new UnsupportedOperationException();
   } // public void add(Component

   @Override
   public Component getChild(int index) {
      throw new UnsupportedOperationException();
   } // public Component getChild(int)
   
   @Override
   public boolean remove(Component component) {
      throw new UnsupportedOperationException();
   } // public boolean remove(Component)
} // public class FuncionarioLeaf extends Component
