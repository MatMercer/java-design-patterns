/*
 * Exercício: Memento.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Funcionario;

/**
 *
 * @author 
 */
public class MementoPrincipal {
   public MementoPrincipal() {
      Funcionario funcionario = new Funcionario("Jose", 3424.333d);
      funcionario.setDespesas(2342.33d);
      funcionario.setProventos(32.44d);

      System.out.println(funcionario.getSalario());
      funcionario.save();

      funcionario.calcularSalarioLiquido();
      System.out.println(funcionario.getSalario());

      funcionario.restore();
      System.out.println(funcionario.getSalario());
   } // public MementoPrincipal()
   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new MementoPrincipal(); }
} // public class MementoPrincipal
