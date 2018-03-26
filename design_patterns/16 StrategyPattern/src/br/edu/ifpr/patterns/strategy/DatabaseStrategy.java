package br.edu.ifpr.patterns.strategy;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public abstract class DatabaseStrategy {
   protected String server;
   protected String databaseURL;
   protected int    port;
   protected String user;
   protected String password;
   
   public DatabaseStrategy(String server, String databaseURL, int port,
                           String user, String password) {
      this.server      = server;
      this.databaseURL = databaseURL;
      this.port        = port;
      this.user        = user;
      this.password    = password;
   } // public DatabaseStrategy(String, String, int, String, String)
   
   public abstract void   loadDriver() throws ClassNotFoundException;
   public abstract String generateURL();
   public abstract String format(Object obj);
} // public abstract class DatabaseStrategy
