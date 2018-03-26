/*
 * Exercício: Composite.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class CompositePrincipal {
   public CompositePrincipal() {
      // O usuário deverá informar uma lista de nomes de arquivos e de nomes de
      // diretórios na linha de comando a ser passada à aplicação. Esta, então,
      // deverá verificar:
      // a) se não foi passado qualquer parâmetro na linha de comando, a
      //    aplicação emite uma mensagem alertando o usuário sobre o fato e
      //    termina;
      // b) se o nome passado representa um arquivo deverá criar um objeto para
      //    tal;
      // d) se representa o nome de um diretório deverá recuperar os arquivos
      //    deste diretório;
      // O processamento para (b) e (c) pode ser feito utilizando-se a classe
      // java.io.File.
      // Uma vez que todos os nomes passados pela linha de comando foram
      // processados, a aplicação deve exibí-los da seguinte forma:
      // 1) para arquivo mostrar seu caminho completo e tamanho (em bytes);
      // 2) para diretório mostrar <DIR> e o nome do diretório e, em seguida,
      //    processar os arquivos encontrados neste diretório, de acordo com o
      //    item (1).
      // ==> Para execução da aplicação em linha de comando, basta digitar:
      // java NomeDaClasse parametro1 parametro2 ... parametroN
      // ==> Para execução da aplicação pelo Eclipse:
      // a) clicar com o botão direito do mouse sobre o nome do projeto;
      // b) selecionar "Run As";
      // c) selecionar "Open Run Dialog...";
      // d) clicar no botão "New launch configuration";
      // e) selecionar a classe principal, se necessário for;
      // f) cliar na aba "(x)= Arguments";
      // g) informar os parâmetros no campo "Program arguments";
      // h) clicar no botão "Run".
      // ==> Para execução da aplicação pelo NetBeans:
      // a) clicar com o botão direito do mouse sobre o nome do projeto;
      // b) selecionar "Properties";
      // c) selecionar "Run";
      // d) informar os parâmetros no campo "Arguments";
      // e) clicar no botão "OK".
   } // public CompositePrincipal()
   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) {
   } // public static void main(String[])
} // public class CompositePrincipal
