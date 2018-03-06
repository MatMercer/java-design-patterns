package br.edu.ifpr.patterns.command;

public class BaixarCtasReceberCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Realizando baixa no Contas a Receber.");
    }
}
