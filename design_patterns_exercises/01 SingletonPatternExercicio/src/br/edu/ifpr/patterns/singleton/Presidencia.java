package br.edu.ifpr.patterns.singleton;

/**
 *
 * @author 
 */
public class Presidencia {
   private static Presidencia instance = null;

   private String nomePresidente;

   private Presidencia() {
   } // public Presidencia(String)

   public static Presidencia getInstance() {
      if (instance == null)
         instance = new Presidencia();

      return instance;
   }

   public void setNomePresidente(String nomePresidente) {
      this.nomePresidente = nomePresidente;
   }

   public String getNomePresidente() { return nomePresidente; }
} // public class Presidencia
