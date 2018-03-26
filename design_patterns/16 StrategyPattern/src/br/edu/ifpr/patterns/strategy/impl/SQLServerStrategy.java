package br.edu.ifpr.patterns.strategy.impl;

import br.edu.ifpr.patterns.strategy.DatabaseStrategy;

import java.text.SimpleDateFormat;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class SQLServerStrategy extends DatabaseStrategy {
   private static final String JDBC_DRIVER = 
                                 "com.microsoft.jdbc.sqlserver.SQLServerDriver";
   private static final String JDBC_URL    = "jdbc:microsoft:sqlserver://";
   private static final int    JDBC_PORT   = 1433;
   
   private static final SimpleDateFormat dateFormat =
                                new SimpleDateFormat("''MM-dd-yyyy HH:mm:ss''");

   public SQLServerStrategy(String server, String databaseURL, int port,
                            String user, String password) {
      super(server,databaseURL,port,user,password);
   } // public SQLServerStrategy(String, String, int, String, String)

   public SQLServerStrategy(String server, String databaseURL, String user,
                            String password) {
      super(server,databaseURL,JDBC_PORT,user,password);
   } // public SQLServerStrategy(String, String, int, String, String)
   
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

      if (Boolean.class.equals(clazz) || boolean.class.equals(clazz)) {
         if (((Boolean) obj).booleanValue()) return "1";
         else return "0";
      } // if (Boolean.class.equals(clazz) || boolean.class.equals(clazz))
      
      return obj.toString();
   } // public String format(Object)

   @Override
   public String generateURL() {
      StringBuffer buffer = new StringBuffer(JDBC_URL);
      buffer.append(server);
      buffer.append(":" + JDBC_PORT + ";databasename=");
      buffer.append(databaseURL);
      buffer.append(";user=");
      buffer.append(user);
      if (password != null && !password.isEmpty()) {
         buffer.append(";password=");
         buffer.append(password);
      } // if (password != null && !password.isEmpty())
      return buffer.toString();
   } // public String generateURL()

   @Override
   public void loadDriver() throws ClassNotFoundException {
      Class.forName(JDBC_DRIVER);
   } // public void loadDriver() throws ClassNotFoundException
} // public class SQLServerStrategy extends DatabaseStrategy
