package br.edu.ifpr.patterns.proxy.impl;

import br.edu.ifpr.patterns.proxy.FileOperations;

public class FileOperationsImpl implements FileOperations {
   @Override
   public boolean deleteFile(String fileName) {
      // EXCLUIR O ARQUIVO RETORNANDO true NO CASO DE SUCESOS OU false EM CASO
      // DE ERRO
      return false;
   } // public boolean deleteFile(String)
} // public class FileOperationsImpl implements FileOperations
