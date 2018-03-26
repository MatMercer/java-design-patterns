package br.edu.ifpr.modelo.util;

import br.edu.ifpr.modelo.Empregado;
import br.edu.ifpr.patterns.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * EstruturaDeObjetos.
 * 
 * @author Romualdo Rubens de Freitas
 */
public class Empregados {
   private List<Empregado> empregados = new ArrayList<Empregado>();

   public void addEmpregado(Empregado emp) { empregados.add(emp); }
   public void removeEmpregado(Empregado emp) { empregados.remove(emp); }

   public void accept(Visitor visitor) {
      for (Empregado empregado : empregados)
         empregado.accept(visitor);
   } // public void accept(Visitor)
} // public class Empregados
