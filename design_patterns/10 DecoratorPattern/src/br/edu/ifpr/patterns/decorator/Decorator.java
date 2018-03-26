package br.edu.ifpr.patterns.decorator;

import br.edu.ifpr.modelo.ItemBibliotecaAbstract;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class Decorator extends ItemBibliotecaAbstract {
   protected ItemBibliotecaAbstract item;

   public Decorator(ItemBibliotecaAbstract item) { this.item = item; }

   @Override
   public void mostrar() { item.mostrar(); }
} // public abstract class Decorator extends ItemBibliotecaAbstract
