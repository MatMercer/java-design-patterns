package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.adapter.EnumerationIterator;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class AdapterPrincipal {
    /**
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
       Vector<String> v = new Vector<String>();
       
       v.add("Texto UM");
       v.add("Texto DOIS");
       v.add("Texto TRES");
       v.add("Texto QUATRO");
       v.add("Texto CINCO");
       
       Iterator it = new EnumerationIterator(v.elements());
       while (it.hasNext())
          System.out.println("Valor: " + it.next());
    } // public static void main(String[])
} // public class AdapterPrincipal
