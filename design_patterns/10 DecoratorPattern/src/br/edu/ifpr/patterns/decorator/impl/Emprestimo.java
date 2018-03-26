package br.edu.ifpr.patterns.decorator.impl;

import br.edu.ifpr.modelo.ItemBibliotecaAbstract;
import br.edu.ifpr.patterns.decorator.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Emprestimo extends Decorator {
   private List<String> devedores = new ArrayList<String>();

   public Emprestimo(ItemBibliotecaAbstract item) { super(item); }

   public void emprestar(String devedor) {
      devedores.add(devedor);
      item.setExemplares(item.getExemplares() - 1);
   } // public void emprestar(String)

   public void devolver(String devedor) {
      devedores.remove(devedor);
      item.setExemplares(item.getExemplares() + 1);
   } // public void devolver(String)

   @Override
   public void mostrar() {
      super.mostrar();
      for (String devedor : devedores)
         System.out.println("Devedor " + devedor);
   } // public void mostrar()
} // public class Emprestimo extends Decorator
