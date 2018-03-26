package br.edu.ifpr.patterns.bridge;

import br.edu.ifpr.modelo.Cliente;

import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
 /** Abstraction **/
public class ClienteNavigator {
   private DataNavigator<Cliente> dn;

   public DataNavigator<Cliente> getClienteNavigator() { return dn; }
   public void          setClienteNavigator(DataNavigator<Cliente> dn) { this.dn = dn; }

   public void          insert(Cliente c) { dn.insert(c); }
   public void          update(Cliente c) { dn.update(c); }
   public void          delete(Cliente c) { dn.delete(c); }
   public List<Cliente> select() { return dn.select(); }
} // public class ClienteNavigator
