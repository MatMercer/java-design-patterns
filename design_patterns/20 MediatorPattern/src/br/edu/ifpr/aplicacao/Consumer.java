package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.mediator.Mediator;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Consumer extends Thread {
   private Mediator mediator;
   private int      id;

   private static int num = 1;

   public Consumer(Mediator mediator) {
      this.mediator = mediator;
      this.id = num++;
   } // public Consumer(Mediator)

   @Override
   public void run() {
      while (true)
         System.out.println("Consumidor[" + id + "] " +
                            mediator.retrieveMessage());
   } // public void run()
} // public class Consumer extends Thread
