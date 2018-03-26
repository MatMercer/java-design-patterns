package br.edu.ifpr.patterns.mediator;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Mediator {
   private boolean slotFull = false;
   private int     number;

   public synchronized void storeMessage(int num) {
      while (slotFull == true)
         try { wait(); }
         catch (InterruptedException ex) {}
      slotFull = true;
      number   = num;
      notifyAll();
   } // public synchronized void storeMessage(int)

   public synchronized int retrieveMessage() {
      while (slotFull == false)
         try { wait(); }
         catch (InterruptedException ex) {}
      slotFull = false;
      notifyAll();
      
      return number;
   } // public synchronized int retrieveMessage()
} //public class Mediator
