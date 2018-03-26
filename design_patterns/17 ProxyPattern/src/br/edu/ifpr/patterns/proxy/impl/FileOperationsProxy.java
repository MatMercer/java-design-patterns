package br.edu.ifpr.patterns.proxy.impl;

import br.edu.ifpr.patterns.proxy.FileOperations;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class FileOperationsProxy implements FileOperations {
   private FileOperations fo;

   public FileOperationsProxy() { this.fo = new FileOperationsImpl(); }

   @Override
   public boolean deleteFile(String fileName) {
      boolean canDelete = false;

      // se há permissão para excluir o arquivo
      //    entao
      canDelete = fo.deleteFile(fileName);
      // fim-se
      
      return canDelete;
   } // public boolean deleteFile(String)
} // public class FileOperationsProxy implements FileOperations
