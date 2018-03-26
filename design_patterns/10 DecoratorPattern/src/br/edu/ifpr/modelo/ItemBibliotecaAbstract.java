package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class ItemBibliotecaAbstract {
   protected int exemplares;

   // setter
   public void setExemplares(int exemplares) { this.exemplares = exemplares; }
   // getter
   public int getExemplares() { return exemplares; }

   public abstract void mostrar();
} // public abstract class ItemBibliotecaAbstract
