package br.edu.ifpr.patterns.interpreter;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Context {
   private String in;
   private int    out;

   public Context(String in) { setIn(in); }
   // setters
   public void setIn(String in) { this.in = in; }
   public void setOut(int out) { this.out = out; }
   // getters
   public String getIn() { return in; }
   public int    getOut() { return out; }
} // public class Context
