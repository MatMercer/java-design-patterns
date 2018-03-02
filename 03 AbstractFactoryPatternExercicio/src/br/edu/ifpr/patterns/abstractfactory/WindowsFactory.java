package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.aplicacao.Botao;
import br.edu.ifpr.aplicacao.BotaoWindows;

public class WindowsFactory implements AbstractFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}
