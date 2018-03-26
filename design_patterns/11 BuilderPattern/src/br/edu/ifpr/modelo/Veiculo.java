package br.edu.ifpr.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Veiculo {
   private String              tipo;
   private Map<String, String> partes;

   public Veiculo(String tipo) {
      this.tipo   = tipo;
      this.partes = new HashMap<String, String>();
   } // public Veiculo(String)

   public void addParte(String pv, String parte) {
      partes.put(pv,parte);
   } // public void addParte(String, String)

   public void mostrar() {
      System.out.println("Veiculo " + tipo);
      System.out.println(" Carroceira: " + partes.get("carroceria"));
      System.out.println(" Motor.....: " + partes.get("motor"));
      System.out.println(" Rodas.....: " + partes.get("rodas"));
      System.out.println(" Portas....: " + partes.get("portas"));
   } // public void mostrar()
} // public class Veiculo
