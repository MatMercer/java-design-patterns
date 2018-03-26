package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.mediator.Mediator;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class MediatorPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       Mediator mediator = new Mediator();

       (new Producer(mediator)).start();
       (new Producer(mediator)).start();
       (new Consumer(mediator)).start();
       (new Consumer(mediator)).start();
       (new Consumer(mediator)).start();
       (new Consumer(mediator)).start();
    } // public static void main(String[])
} // public class MediatorPrincipal
