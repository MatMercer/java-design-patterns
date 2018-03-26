package br.edu.ifpr.modelo;

/**
 *
 * @author 
 */
public class Ventilador {
   private int estadoAtual = 0;

   public void trocar() {
      if (estadoAtual == 0) {
         estadoAtual = 1;
         System.out.println("Velocidade UM");
      } // if (estadoAtual == 0)
      else
         if (estadoAtual == 1) {
            estadoAtual = 2;
            System.out.println("Velocidade DOIS");
         } // if (estadoAtual == 1)
         else
            if (estadoAtual == 2) {
               estadoAtual = 3;
               System.out.println("Velocidade TRES");
            } // if (estadoAtual == 2)
            else {
               estadoAtual = 0;
               System.out.println("Desligado");
            } // else - if (estadoAtual == 2)
   } // public void trocar()
} // public class Ventilador
