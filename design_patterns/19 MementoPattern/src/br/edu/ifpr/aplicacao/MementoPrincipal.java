package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Cliente;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class MementoPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Cliente c = new Cliente("Um Nome","Uma Cidade");

       System.out.println(c);
       c.setCidade("Outra Cidade");
       System.out.println(c);
       
       Caretaker ct = new Caretaker();
       ct.setMemento(c.save());

       c.setCidade("Uma outra cidade");
       System.out.println(c);

       c.restore(ct.getMemento());
       System.out.println(c);
    } // public static void main(String[])
} // public class MementoPrincipal
