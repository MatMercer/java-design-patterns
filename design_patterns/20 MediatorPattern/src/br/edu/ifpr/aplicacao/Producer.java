package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.mediator.Mediator;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Producer extends Thread {
   private Mediator mediator;
   private int      id;

   private static int num = 1;

   public Producer(Mediator mediator) {
      this.mediator = mediator;
      this.id       = num++;
   } // public Producer(Mediator)

   @Override
   public void run() {
      int number = 0;

      while (true) {
         mediator.storeMessage(number = (int) (Math.random() * 100));
         System.out.println("Produtor[" + id + "] " + number);
      } // while (true)
   } // public void run()
} // public class Producer extends Thread
