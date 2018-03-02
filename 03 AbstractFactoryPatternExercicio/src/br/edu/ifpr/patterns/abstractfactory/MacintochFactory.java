package br.edu.ifpr.patterns.abstractfactory;

import br.edu.ifpr.aplicacao.Botao;
import br.edu.ifpr.aplicacao.BotaoMacintoch;

public class MacintochFactory implements AbstractFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoMacintoch();
    }
}
