package br.edu.ifpr.aplicacao;

import br.edu.ifpr.ui.VendaFrame;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CommandPrincipal {
    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new VendaFrame().setVisible(true);
         }
      });
    } // public static void main(String[])
} // public class CommandPrincipal
