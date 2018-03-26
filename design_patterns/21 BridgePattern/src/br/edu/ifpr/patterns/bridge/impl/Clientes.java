package br.edu.ifpr.patterns.bridge.impl;

import br.edu.ifpr.modelo.Cliente;
import br.edu.ifpr.patterns.bridge.ClienteNavigator;

import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
/** RefinedAbstraction **/
public class Clientes extends ClienteNavigator {
   public void mostrar() {
      List<Cliente> clientes = select();

      for (Cliente c : clientes)
         System.out.println(c);
   } // public void mostrar()
} // public class Clientes extends ClienteNavigator
