package br.edu.ifpr.patterns.singleton;

/**
 * Singleton (Criação - Creational)
 * Este exemplo apresenta a criação do objeto "singleton" utilizando
 * instanciação sob demanda (lady instantiation), o que significa que o objeto
 * será criado somente quando for necessário, a partir da chamada ao método
 * getInstance. Outra possibilidade é a criação do objeto assim que a classe
 * é carregada. Neste caso, o valor "null", atribuido inicialmente ao objeto
 * instance, deve ser substituído pela criação da referência -
 * new SystemConfig() e 'if' no início do método getInstance() removido.
 * Outro aspecto importante a considerar é o uso deste padrão de projeto em
 * aplicações multi-threaded. O correto sincronizmo entre threads evita que,
 * apesar de se querer apenas uma instância, a aplicação acabe tendo duas ou
 * mais.
 *
 * @author Romualdo Rubens de Freitas
 */
public class SystemConfig {
   /**
    * Este é o objeto "singleton" que será retornado pelo método getInstance e
    * a partir do qual os métodos getXXX, abaixo, serão invocados.
    */
   private static SystemConfig instance = null;
   /**
    * Recupera o nome do usuário a partir das propriedades mantidas pela JVM.
    * 
    * @return o nome do usuário utilizado no "logon"
    */
   public String getUserName() { return System.getProperty("user.name"); }
   /**
    * Recupera o diretório raíz do usuário.
    * 
    * @return o diretório raíz do usuário
    */
   public String getUserHome() { return System.getProperty("user.home"); }
   /**
    * Recupera o diretório atual no qual o usuário encontra-se.
    * 
    * @return o diretório atual (de trabalho)
    */
   public String getUserDir() { return System.getProperty("user.dir"); }
   /**
    * O construtor DEVE ser 'private' para evitar que objetos sejam criados por
    * outras classes.
    */
   private SystemConfig() {}
   /**
    * Cria o objeto "singleton" a ser utilizado.
    * 
    * @return instance o objeto "singleton"
    */
   public static SystemConfig getInstance() {
      if (instance == null) instance = new SystemConfig();

      return instance;
   } // public static SystemConfig getInstance()
} // public class SystemConfig
