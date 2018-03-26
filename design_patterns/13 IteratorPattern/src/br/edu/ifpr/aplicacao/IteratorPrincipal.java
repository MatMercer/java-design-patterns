package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Pessoa;
import br.edu.ifpr.patterns.iterator.IteratorGOF;
import br.edu.ifpr.util.Vetor;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class IteratorPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Calendar c = new GregorianCalendar();

       c.set(1900,0,1);
       Pessoa p1 = new Pessoa(1,"Gasparzinho",c.getTime());
       c.set(1880,11,10);
       Pessoa p2 = new Pessoa(2,"Ana Neri",c.getTime());
       c.set(1900,9,20);
       Pessoa p3 = new Pessoa(3,"Virgulino Lampiao",c.getTime());
       c.set(1930,6,8);
       Pessoa p4 = new Pessoa(4,"Tiao Macale",c.getTime());
       c.set(1955,10,25);
       Pessoa p5 = new Pessoa(5,"Ronald Golias",c.getTime());
       
       Vetor v = new Vetor();
       v.add(p1);
       v.add(p2);
       v.add(p3);
       v.add(p4);
       v.add(p5);
       
       IteratorGOF it = v.createIterator();
       for (Object o = it.first(); !it.isDone(); o = it.next()) {
          Pessoa p = (Pessoa) o;
          System.out.println(p);
       } // for (Object o = it.first(); !it.isDone(); o = it.next())
    } // public static void main(String[])
} // public class IteratorPrincipal
