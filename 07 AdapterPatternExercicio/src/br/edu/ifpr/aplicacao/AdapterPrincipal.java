/*
 * Exercício: Adapter.
 * Converter esta aplicação para que faça uso do padrão de projetos Adapter
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.LinhaLegado;
import br.edu.ifpr.modelo.RetanguloLegado;

/**
 *
 * @author 
 */
public class AdapterPrincipal {
   public AdapterPrincipal() {
      Object[] figuras = { new LinhaLegado(), new RetanguloLegado() };

      int x1 = 10, y1 = 20;
      int x2 = 30, y2 = 60;
      
      for (int i = 0; i < figuras.length; i++)
         if (figuras[i].getClass().getSimpleName().equals("LinhaLegado"))
            ((LinhaLegado) figuras[i]).desenhar(x1,y1,x2,y2);
         else
            if (figuras[i].getClass().getSimpleName().equals("RetanguloLegado"))
               ((RetanguloLegado) figuras[i]).desenhar(Math.min(x1,x2),
                                                       Math.min(y1,y2),
                                                       Math.abs(x2-x1),
                                                       Math.abs(y2-y1));
   } // public AdapterPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new AdapterPrincipal(); }
} // public class AdapterPrincipal
