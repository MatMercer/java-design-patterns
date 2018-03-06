package br.edu.ifpr.patterns.chain;

import br.edu.ifpr.modelo.Produto;

import static java.lang.System.out;

public class BalancaCozinha extends BalancaHandler {
    @Override
    public void medirPeso(Produto prod) {
        if (prod.getPeso() < 15) {
            out.println("Balança de cozinha mediu " + prod.getPeso() + " quilos.");
        }
        else  {
            out.println("Balança de cozinha não aguentou!");
            if (proximaBalanca != null) {
                proximaBalanca.medirPeso(prod);
            }
        }
    }
}
