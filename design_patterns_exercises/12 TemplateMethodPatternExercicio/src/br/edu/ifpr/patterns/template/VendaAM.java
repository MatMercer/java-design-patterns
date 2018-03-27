package br.edu.ifpr.patterns.template;

import br.edu.ifpr.modelo.Produto;

public class VendaAM extends Venda {
    public VendaAM(Produto produto) {
        super(produto);
    }

    @Override
    public float calcularJuros() {
        return 0.1f;
    }

    @Override
    public VendaType getVendaType() {
        return VendaType.AM;
    }
}
