/*
 * Exercício: Mediator.
 * Converter esta aplicação para que faça uso do padrão de projetos citado
 * realizando quaisquer modificações no projeto e na aplicação que sejam
 * necessárias, inclusive utilizando outros padrões de projeto.
 */
package br.edu.ifpr.aplicacao;

/**
 *
 * @author 
 */
public class MediatorPrincipal {
   public MediatorPrincipal() {
      // Crie uma aplicação capaz de simular o envio de mensagens entre objetos
      // Pessoa, sendo estes Professor e Aluno.
      // De acordo com o Diagrama UML para este padrão de projetos, as classes
      // constituintes podem ser:
      // Mediator: classe abstrata que descreve uma sala de bate-pato (chat),
      //           contendo um método para registrar uma pessoa na sala e outro
      //           para enviar uma mensagem da pessoa remetente à pessoa
      //           destinatário;
      // ConcreteMediator: classe que implementa os métodos de Mediator;
      // AbstractColleague: descreve uma pessoa na sala de bate-papo, contendo
      //                    seu nome e a sala na qual ela se encontra;
      // ConcreteColleagueA: Professor implementando AbstractColleague;
      // ConcreteColleagueB: Aluno implementando AbstractColleague.
   } // public MediatorPrincipal()
   /**
    * @param args os argumentos de linha de comando
    */
   public static void main(String[] args) { new MediatorPrincipal(); }
} // public class MediatorPrincipal
