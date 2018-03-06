package br.edu.ifpr.patterns.command;

public class ExtornarCtasReceberCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Extornando lancamento do Contas a Receber.");
    }
}
