package br.edu.ifpr.patterns.chain;

import br.edu.ifpr.modelo.Produto;

import static java.lang.System.out;

public class BalancaFarmacia extends BalancaHandler {
    @Override
    public void medirPeso(Produto prod) {
        if (prod.getPeso() < 150) {
            out.println("Balança de farmácia mediu " + prod.getPeso() + " quilos.");
        }
        else {
            out.println("Balança de farmácia não aguentou!");
            if (proximaBalanca != null) {
                proximaBalanca.medirPeso(prod);
            }
        }
    }
}
