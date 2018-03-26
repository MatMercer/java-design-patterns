package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.composite.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DepartamentoComposite extends Component {
   private String          nome;
   private List<Component> funcs;

   public DepartamentoComposite(String nome) {
      setNome(nome);
      funcs = new ArrayList<Component>();
   } // public DepartamentoComposite(String)
   // setters
   public void setNome(String nome) { this.nome = nome; }
   // getters
   public String getNome() { return nome; }

   public void      add(Component c) { funcs.add(c); }
   public boolean   remove(Component c) { return funcs.remove(c); }
   public Component getChild(int index) { return funcs.get(index); }

   @Override
   public void processar() { 
      System.out.println("Departamento: " + nome);
      for (Component f : funcs) f.processar();
   } // public void processar()
} // public class DepartamentoComposite extends Component
