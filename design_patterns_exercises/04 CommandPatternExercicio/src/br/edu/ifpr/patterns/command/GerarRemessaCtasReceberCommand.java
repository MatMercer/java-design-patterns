package br.edu.ifpr.patterns.command;

public class GerarRemessaCtasReceberCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Gerando arquivo de Remessa do Contas a Receber.");
    }
}
