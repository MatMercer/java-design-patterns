package br.edu.ifpr.patterns.command.invoker;

import br.edu.ifpr.patterns.command.Command;
import br.edu.ifpr.patterns.command.factory.CommandFactory;

public class Invoker {
    private static CommandFactory factory;
    private Command cmd;

    public Invoker(CommandFactory.CommandType type) {
        factory = new CommandFactory();

        cmd = factory.create(type);
    }

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(CommandFactory.CommandType type) {
        this.cmd = factory.create(type);
    }
}
