package br.edu.ifpr.patterns.visitor.impl;

import br.edu.ifpr.modelo.Empregado;
import br.edu.ifpr.patterns.visitor.Elemento;
import br.edu.ifpr.patterns.visitor.Visitor;

/**
 * VisitorConcreto1.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class AssalariadoVisitor implements Visitor {
   public void visit(Elemento elemento) {
      Empregado empregado = (Empregado) elemento;
      
      double salario = empregado.getSalario();
      empregado.setSalario(empregado.getSalario() * 1.15);
      System.out.println(empregado.getNome() + " (" +
                         empregado.getClass().getSimpleName() + ") ganhando " +
                         salario + " teve um reajuste de 15% e passou a " +
                         "receber: " + empregado.getSalario());
   } // public void visit(Elemento)
} // public class AssalariadoVisitor implements Visitor
