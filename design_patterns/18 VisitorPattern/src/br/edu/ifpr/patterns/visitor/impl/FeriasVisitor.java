package br.edu.ifpr.patterns.visitor.impl;

import br.edu.ifpr.modelo.Empregado;
import br.edu.ifpr.patterns.visitor.Elemento;
import br.edu.ifpr.patterns.visitor.Visitor;

/**
 * VisitorConcreto2.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class FeriasVisitor implements Visitor {
   public void visit(Elemento elemento) {
      Empregado empregado = (Empregado) elemento;
      
      System.out.println(empregado.getNome() + "(" +
                         empregado.getClass().getSimpleName() + ")" +
                         " tera ferias de " + empregado.getFerias() +
                         " dias.");
   } // public void visit(Elemento)
} // public class FeriasVisitor implements Visitor
