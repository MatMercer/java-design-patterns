package br.edu.ifpr.patterns.command;

public class LancarCtasReceberCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Lancando no Contas a Receber.");
    }
}
