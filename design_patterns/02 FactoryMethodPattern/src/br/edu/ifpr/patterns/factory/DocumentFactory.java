package br.edu.ifpr.patterns.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import br.edu.ifpr.docs.Document;
import br.edu.ifpr.docs.ExcelDocument;
import br.edu.ifpr.docs.TextDocument;
import br.edu.ifpr.docs.WordDocument;
import br.edu.ifpr.docs.XmlDocument;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DocumentFactory {
   /*
    * Tipos de documentos para os quais uma referência é retornada.
    */
   public static final String WORD_DOC  = "WORD_DOC";
   public static final String EXCEL_DOC = "EXCEL_DOC";
   public static final String XML_DOC   = "XML_DOC";
   public static final String TEXT_DOC  = "TEXT_DOC";
   /**
    * Esta implementação assume que as classes para as quais os objetos serão
    * criados encontram-se disponíveis na aplicação ou mediante o uso de uma
    * biblioteca (arquivo .JAR). Além disto, este tipo de implementação é
    * conhecido como método 'factory' estático, pois, para cada "produto" real,
    * deve haver código que realize a criação de um objeto.
    * 
    * @param tipoDoc descreve o tipo do documento a ser criado
    * 
    * @return o documento criado.
    */
   public static Document createDocumentFactory(String tipoDoc) {
      Document doc = null;
      
      if (WORD_DOC.equals(tipoDoc)) doc = new WordDocument();
      else
         if (EXCEL_DOC.equals(tipoDoc)) doc = new ExcelDocument();
         else
            if (XML_DOC.equals(tipoDoc)) doc = new XmlDocument();
            else
               if (TEXT_DOC.equals(tipoDoc)) doc = new TextDocument();

      return doc;
   } // public static Document createDocumentFactory(String)
   /**
    * Esta implementação obém o nome da classe para a qual um objeto será
    * criado a partir do arquivo de propriedades e cria a instância do
    * documento utilizando reflexão. Este tipo de implementação é denominado
    * método 'factory' dinâmico, pois, para um novo "produto", não há
    * necessidade de alteração no código, bastando que uma nova linha contendo
    * o nome qualificado da classe seja acrescentada ao arquivo de propriedades.
    * 
    * @param tipoDoc descreve o tipo do documento a ser criado
    * 
    * @return o documento criado.
    */
   public static Document createDynamicDocumentFactory(String tipoDoc) {
      Properties prop      = loadProperties();
      String     className = prop.getProperty(tipoDoc);

      Class<?> clazz = null;
      try { clazz = Class.forName(className); }
      catch (ClassNotFoundException ex) { ex.printStackTrace(); }
      
      Object instance = null;
      try { instance = clazz.newInstance(); }
      catch (InstantiationException ex) { ex.printStackTrace(); }
      catch (IllegalAccessException ex) { ex.printStackTrace(); }
      
      return (Document) instance;
   } // public static Document createDynamicDocumentFactory(String)
   /**
    * Carrega o arquivo de propriedades (properties file).
    * 
    * @return uma referência ao arquivo de propriedades contendo os nomes
    * qualificados das classes a serem carregadas.
    */
   private static Properties loadProperties() {
      Properties prop = new Properties();
      try {
         prop.load(DocumentFactory.class.getResourceAsStream(
                                  "/br/edu/utfpr/resource/classes.properties"));
      }
      catch (FileNotFoundException ex) { ex.printStackTrace(); }
      catch (IOException ex) { ex.printStackTrace(); }

      return prop;
   } // private static Properties loadProperties()
} // public class DocumentFactory
