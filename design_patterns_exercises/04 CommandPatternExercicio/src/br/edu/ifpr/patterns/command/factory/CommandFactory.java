package br.edu.ifpr.patterns.command.factory;

import br.edu.ifpr.patterns.command.*;

public class CommandFactory implements Factory<Command, CommandFactory.CommandType> {
    public enum CommandType {
        LANCAR_CTAS_RECEBER(1),
        BAIXAR_CTAS_RECEBER(2),
        EXTORNAR_CTAS_RECEBER(3),
        GERAR_REMESSA_CTAS_RECEBER(4);

        private int id;

        public int getId() {
            return id;
        }

        CommandType (int id) {
            this.id = id;
        }
    }

    @Override
    public Command create(CommandType en) {
        switch (en) {
            case LANCAR_CTAS_RECEBER:
                return new LancarCtasReceberCommand();
            case BAIXAR_CTAS_RECEBER:
                return new BaixarCtasReceberCommand();
            case EXTORNAR_CTAS_RECEBER:
                return new ExtornarCtasReceberCommand();
            case GERAR_REMESSA_CTAS_RECEBER:
                return new GerarRemessaCtasReceberCommand();
        }

        return null;
    }
}
