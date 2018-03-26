package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Cliente;
import br.edu.ifpr.patterns.bridge.impl.ClienteDataNavigator;
import br.edu.ifpr.patterns.bridge.impl.Clientes;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class BridgePrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Clientes cs = new Clientes();

       cs.setClienteNavigator(new ClienteDataNavigator());
       cs.insert(new Cliente(1,"Pedro Alvares Cabral","12345678900"));
       cs.insert(new Cliente(2,"Pero Vaz de Caminha","98765432100"));
       cs.insert(new Cliente(3,"Vasco da Gama","45617283900"));
       cs.mostrar();
    } // public static void main(String[])
} // public class BridgePrincipal
