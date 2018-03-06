package br.edu.ifpr.patterns.chain;

import br.edu.ifpr.modelo.Produto;

import static java.lang.System.out;

public class BalancaPrecisao extends BalancaHandler {
    @Override
    public void medirPeso(Produto prod) {
        if (prod.getPeso() < 5) {
            out.println("Balança de precisão mediu " + prod.getPeso() + " quilos.");
        }
        else {
            out.println("Balança de precisão não aguentou!");
            if (proximaBalanca != null) {
                proximaBalanca.medirPeso(prod);
            }
        }
    }
}
