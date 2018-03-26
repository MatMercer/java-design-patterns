package br.edu.ifpr.patterns.strategy.impl;

import br.edu.ifpr.patterns.strategy.DatabaseStrategy;

import java.text.SimpleDateFormat;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class MSAccessStrategy extends DatabaseStrategy {
   private static final String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
   private static final String JDBC_URL    = "jdbc:odbc:";

   private static final SimpleDateFormat dateFormat =
                                  new SimpleDateFormat("#MM-dd-yyyy HH:mm:ss#");

   public MSAccessStrategy(String server, String databaseURL, String user,
                           String password) {
      super(server,databaseURL,0,user,password);
   } // public MSAccessStrategy(String, String, String, String)
   
   @Override
   public String format(Object obj) {
      if (obj == null) return null;

      Class<?> clazz = obj.getClass();
      if (Character.class.equals(clazz) || char.class.equals(clazz))
         obj = obj.toString();

      if (obj instanceof String) {
         StringBuffer sb = new StringBuffer((String) obj);
         for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '\'') {
               sb.insert(i,'\'');
               i++;
            } // if (sb.charAt(i) == '\'')
         } // for (int i = 0; i < sb.length(); i++)
         return "\'" + sb + "\'";
      } // if (obj instanceof String) 

      if (obj instanceof java.util.Date) return dateFormat.format(obj);
      
      return obj.toString();
   } // public String format(Object)

   @Override
   public String generateURL() { return JDBC_URL + databaseURL; }

   @Override
   public void loadDriver() throws ClassNotFoundException {
      Class.forName(JDBC_DRIVER);
   } // public void loadDriver() throws ClassNotFoundException
} // public class MSAccessStrategy extends DatabaseStrategy
