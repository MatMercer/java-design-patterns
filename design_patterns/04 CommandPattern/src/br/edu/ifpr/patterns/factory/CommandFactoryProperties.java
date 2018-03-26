package br.edu.ifpr.patterns.factory;

import br.edu.ifpr.patterns.command.Command;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class CommandFactoryProperties implements CommandFactory {
    private final String VENDA_FILE = "/br/edu/utfpr/resource/venda.properties";

    private Properties prop = new Properties();
    
    public CommandFactoryProperties() {       
       InputStream is = getClass().getResourceAsStream(VENDA_FILE);
       try {
          prop.load(is);
          is.close();
       }
       catch (Exception ex) { ex.printStackTrace(); }
    } // public CommandFactoryProperties()
    
    public Command createCommandFactory(String cmd) {
       Command command   = null;
       String  className = prop.getProperty(cmd);
       
       try {
          Class<?>  clazz = Class.forName(className);
          Object obj   = clazz.newInstance();

          command = (Command) obj;
       }
       catch (Exception ex) { ex.printStackTrace(); }
       
       return command;
    } // public Command createCommandFactory(String)    
} // public class CommandFactoryProperties implements CommandFactory
