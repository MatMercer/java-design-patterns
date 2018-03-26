/*
 * Exercício: Proxy.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class ProxyPrincipal {
   public ProxyPrincipal() {
      // Escolha uma das opções a seguir ou, se desejar, implemente ambas:
      // -----------------------------------------------------------------------
      // Opcao 1: Proxy Virtual
      // Esta é uma aplicação capaz de exibir arquivos de imagens de todos os
      // tamanhos possíveis. Por ser uma operação dispendiosa a carga antecipada
      // de arquivos de imagem, a aplicação as carregará apenas no momento em
      // que deve exibí-las.
      // -----------------------------------------------------------------------
      // Opcao 2: Proxy de Proteção
      // Esta é uma aplicação bancária que exibe os dados de uma dada conta de
      // um cliente (conta corrente, poupança ou investimetnos). Antes que os
      // dados da conta sejam retornados à aplicação deve-se verificar se a
      // senha do usuário realizando a operação é válida para usuários com
      // permissão para tal operação. No entanto, a classe encarregada de
      // recuperar e exibir tais informações não deve tomar conhecimento de tal
      // verificação.
      // -----------------------------------------------------------------------
   } // public ProxyPrincipal()
   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new ProxyPrincipal(); }
} // public class ProxyPrincipal
