package br.edu.ifpr.patterns.chain;

import br.edu.ifpr.modelo.Produto;

public abstract class BalancaHandler {
    protected BalancaHandler proximaBalanca;

    public abstract void medirPeso(Produto prod);

    public void setProximaBalanca(BalancaHandler proximaBalanca) {
        this.proximaBalanca = proximaBalanca;
    }
}
