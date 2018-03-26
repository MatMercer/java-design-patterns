package br.edu.ifpr.aplicacao;

import br.edu.ifpr.patterns.proxy.FileOperations;
import br.edu.ifpr.patterns.proxy.impl.FileOperationsProxy;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class ProxyPrincipal {
    /**
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
       String fileName = "C:/pagefile.sys";
       FileOperations fop = new FileOperationsProxy();
       
       if (!fop.deleteFile(fileName))
          System.out.println("Arquivo '" + fileName + "' nao pode ser apagado");
       else
          System.out.println("Arquivo '" + fileName + "' apagado com sucesso");
    } // public static void main(String[]
} // public class ProxyPrincipal
