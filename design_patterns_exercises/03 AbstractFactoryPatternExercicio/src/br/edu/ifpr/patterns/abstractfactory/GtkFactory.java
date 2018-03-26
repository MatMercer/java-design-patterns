package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.aplicacao.Botao;
import br.edu.ifpr.aplicacao.BotaoGtk;

public class GtkFactory implements AbstractFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoGtk();
    }
}
