package br.edu.ifpr.patterns.bridge.impl;

import br.edu.ifpr.modelo.Cliente;
import br.edu.ifpr.patterns.bridge.DataNavigator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** ConcreteImplementor **/
public class ClienteDataNavigator extends DataNavigator<Cliente> {
   private List<Cliente> clientes = new ArrayList<Cliente>();

   @Override
   public void insert(Cliente c) { clientes.add(c); }

   @Override
   public void update(Cliente c) {
      int index = findById(c.getId());

      if (index > -1) clientes.set(index,c);
   } // public void update(Cliente)

   @Override
   public void delete(Cliente c) {
      int index = findById(c.getId());

      if (index > -1) clientes.remove(index);
   } // public void delete(Cliente)

   @Override
   public List<Cliente> select() { return new ArrayList<Cliente>(clientes); }

   private int findById(int id) {
      for (int i = 0; i < clientes.size(); i++)
         if (clientes.get(i).getId() == id) return i;

      return -1; // nao encontrado
   } // private int findById(int)
} // public class ClienteDataNavigator extends DataNavigator
