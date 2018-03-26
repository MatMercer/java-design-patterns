package br.edu.ifpr.modelo;

import br.edu.ifpr.patterns.observer.Investidor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class AcaoAbstract {
   private String           simbolo;
   private BigDecimal       preco;
   private List<Investidor> investidores; // observers

   protected AcaoAbstract(String simbolo, BigDecimal preco) {
      this.investidores = new ArrayList<Investidor>();
      setSimbolo(simbolo);
      setPreco(preco);
   } // protected AcaoAbstract(String, BigDecimal)
   // setters
   public void setSimbolo(String simbolo) { this.simbolo = simbolo; }
   public void setPreco(BigDecimal preco) {
      this.preco = preco;
      // toda vez que o preço de uma ação se modificar, os observadores desta
      // registrados a esta ação (objeto observável) serão notificados.
      change();
   } // public void setPreco(BigDecimal)
   // getters
   public String     getSimbolo() { return simbolo; }
   public BigDecimal getPreco() { return preco; }

   // registro um observador.
   public void attach(Investidor investidor) { investidores.add(investidor); }
   // remove (desregistra) um observador.
   public void detach(Investidor investidor) { investidores.remove(investidor);}

   public void change() {
      // para cada observador registrado o método update() é invocado para 
      // informar o observador da modificação do estado do objeto observável.
      for (Investidor investidor : investidores)
         investidor.update(this);
   } // public void change()
} // public abstract class AcaoAbstract
