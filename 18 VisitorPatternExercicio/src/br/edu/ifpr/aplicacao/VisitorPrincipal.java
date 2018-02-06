/*
 * Exercício: Visitor.
 * Converter esta aplicação para que faça uso do padrão de projetos Visitor
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias.
 */

package br.edu.ifpr.aplicacao;

import br.edu.ifpr.modelo.Azul;
import br.edu.ifpr.modelo.Cor;
import br.edu.ifpr.modelo.Vermelho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class VisitorPrincipal {
   public VisitorPrincipal() {
      List<Cor> cores = new ArrayList<Cor>();

      cores.add(new Vermelho());
      cores.add(new Azul());
      cores.add(new Azul());
      cores.add(new Azul());
      cores.add(new Vermelho());
      cores.add(new Azul());
      cores.add(new Vermelho());
      cores.add(new Azul());
      cores.add(new Vermelho());
      cores.add(new Azul());

      for (Cor cor : cores) {
         cor.totalizar();
         cor.chamar();
      } // for (Cor cor : cores)

      Cor.mostrar();
   } // public VisitorPrincipal()

   /**
    * @param args os argumentos da linha de comando
    */
   public static void main(String[] args) { new VisitorPrincipal(); }
} // public class VisitorPrincipal
