/*
 * Exercício: Bridge.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.bridge.BaseListAbstraction;
import br.edu.ifpr.patterns.bridge.ListImplementor;
import br.edu.ifpr.patterns.bridge.impl.NumberedList;
import br.edu.ifpr.patterns.bridge.impl.OrderedList;
import br.edu.ifpr.patterns.bridge.impl.OrnamentedList;

/**
 *
 * @author 
 */
public class BridgePrincipal {
   public BridgePrincipal() {
      // Implementar listas diferenciadas de acordo com as classes disponíveis,
      // seguindo o padrão de projetos Bridge.
      ListImplementor imp = new OrderedList();
        
      System.out.println("Criando o objeto BaseListAbstraction.");
      BaseListAbstraction list1 = new BaseListAbstraction();
      list1.setImplementor(imp);
      System.out.println();
        
      System.out.println("Acrescentando elementos a lista.");
      list1.add("Um");
      list1.add("Dois");
      list1.add("Tres");
      list1.add("Quatro");
      System.out.println();
      
      System.out.println("Criando o objeto OrnamentedList.");
      OrnamentedList list2 = new OrnamentedList();
      list2.setImplementor(imp);
      list2.setType('+');
      System.out.println();
        
      System.out.println("Criando o objeto NumberedList.");
      NumberedList list3 = new NumberedList();
      list3.setImplementor(imp);
      System.out.println();
        
      System.out.println("Imprimindo a 1a lista (BaseListAbstraction)");
      for (int i = 0; i < list1.count(); i++)
         System.out.println("\t" + list1.get(i));

      System.out.println();
        
      System.out.println("Imprimindo a 2a lista (OrnamentedList)");
      for (int i = 0; i < list2.count(); i++)
         System.out.println("\t" + list2.get(i));

      System.out.println();
        
      System.out.println("Imprimindo a 3a lista (NumberedList)");
      for (int i = 0; i < list3.count(); i++)
         System.out.println("\t" + list3.get(i));
   } // public BridgePrincipal()
   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new BridgePrincipal(); }
} // public class BridgePrincipal
